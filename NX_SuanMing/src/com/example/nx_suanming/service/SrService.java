package com.example.nx_suanming.service;

import java.io.InputStream;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.nx.bean.SrBean;
import com.nx.db.DB;

public class SrService {

	public SrBean find(Context context,String sr,InputStream in,String dbfile) {
		SrBean srBean =null;
		String sql = "select id as _id,sr,jg from TAB_SRSM where sr = '"+sr+"'";
		SQLiteDatabase sqliteDB =  DB.getDababase();
		if(sqliteDB==null){
			DB.initdb(context, in, dbfile);
			sqliteDB =  DB.getDababase();
		}
		try{  
            Cursor result =sqliteDB.rawQuery(sql,null);  
            result.moveToFirst();  
            int cnt=0;  
           
            while(!result.isAfterLast()&&cnt++<10){   
            	srBean=new SrBean();
                srBean.setId( result.getString(0));   
                srBean.setSr( result.getString(1));   
                srBean.setJg(result.getString(2));   
                  
                result.moveToNext();  
            }          
            result.close();    
        }catch(Exception e){  
            e.printStackTrace();  
        }  
		
		return srBean;
		
	}

}
