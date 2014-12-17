package com.model;

import java.io.Serializable;

public class DaijinquanPromotion extends Promotion implements Serializable{
	private int num;
	private String customerId;
	private String time;

	public DaijinquanPromotion() {
		// TODO Auto-generated constructor stub
		super();
	}

	public DaijinquanPromotion(int num, String customerId, String beginTime,
			String endTime, String time) {
		super(beginTime, endTime);
		this.num = num;
		this.customerId = customerId;
		this.time = time;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
}
