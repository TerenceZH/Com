package com.model;

import java.io.Serializable;

public class Log implements Serializable{
	private String id;
	private String type;
	private String desc;
	private String time;

	public Log() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Log(String id, String type, String desc, String time) {
		super();
		this.id = id;
		this.type = type;
		this.desc = desc;
		this.time = time;
	}


	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
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
