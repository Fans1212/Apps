package com.nx.db;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DB {

	public static SQLiteDatabase sqLiteDatabase= null;
	public static SQLiteDatabase getDababase(){
		return sqLiteDatabase;
	}
	public static void initdb(Context context,InputStream in,String dbfile){
		if(sqLiteDatabase!=null) return;
		if (!new File(dbfile).exists()) {  
            try {  
                FileOutputStream out = new FileOutputStream(dbfile);  
  
                byte[] buffer = new byte[1024];  
                int readBytes = 0;  
  
                while ((readBytes = in.read(buffer)) != -1)  
                    out.write(buffer, 0, readBytes);  
  
                in.close();  
                out.close();  
            } catch (IOException e) {  
            }  
        }  
  
		sqLiteDatabase= SQLiteDatabase.openOrCreateDatabase(  
				dbfile,  
                null);  
          
           
          
      /**  try{  
            Cursor result =sqliteDB.rawQuery("SELECT id as _id from shopping",null);  
            result.moveToFirst();  
            int cnt=0;  
            while(!result.isAfterLast()&&cnt++<10){   
                String id = result.getString(1);   
                  
                System.out.println("\t "+id + "]\t");  
                result.moveToNext();  
            }          
            result.close();    
        }catch(Exception e){  
            e.printStackTrace();  
        }  
		*/
	}
}
