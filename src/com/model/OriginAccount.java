package com.model;

import java.io.Serializable;

public class OriginAccount implements Serializable{
	private int id;
	private String time;

	public OriginAccount() {
		// TODO Auto-generated constructor stub
	}

	public OriginAccount(int id, String time) {
		super();
		this.id = id;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
