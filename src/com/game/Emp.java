package com.game;

public class Emp {

	String masterid=null;
	String record=null;
	public String getMasterid() {
		return masterid;
	}
	public void setMasterid(String masterid) {
		this.masterid = masterid;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public Emp(String masterid, String record) {
		super();
		this.masterid = masterid;
		this.record = record;
	}
}
