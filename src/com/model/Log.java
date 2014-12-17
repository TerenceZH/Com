package com.model;

import java.io.Serializable;

public class Log implements Serializable{
	private int type;//0=CCategory,1=Commodity,2=Customer,3=JH,4=TH,5=SK,6=FK,7=QCJZ,8=Approve Bill,9=promotion
	private String desc;
	private String time;

	public Log() {
		// TODO Auto-generated constructor stub
	}

	public Log(int type, String desc, String time) {
		super();
		this.type = type;
		this.desc = desc;
		this.time = time;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public Object getLogValue(int columnNumber){
		switch (columnNumber){
			case 0:
				return getDesc();
			case 1:
				return getTime();
			default:
				return "";
		}
	
	}
	

}
