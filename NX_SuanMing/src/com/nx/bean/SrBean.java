package com.nx.bean;

public class SrBean {

	private String id;
	private String sr;
	private String jg;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSr() {
		return sr;
	}
	public void setSr(String sr) {
		this.sr = sr;
	}
	public String getJg() {
		return jg;
	}
	
	public void setJg(String jg) {
		this.jg = jg;
	}
	
	public SrBean(){}
	
	@Override
	public String toString() {
		return "SrBean [id=" + id + ", sr=" + sr + ", jg=" + jg + "]";
	}
	
}
