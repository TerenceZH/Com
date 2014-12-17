package com.model;

import java.io.Serializable;

public class ZengpinPromotion extends Promotion implements Serializable{
	private String commofityId;
	private String customerId;
	private String time;

	public ZengpinPromotion() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ZengpinPromotion(String commofityId, String customerId,String startTime,String endTime, String time) {
		super(startTime,endTime);
		this.commofityId = commofityId;
		this.customerId = customerId;
		this.time = time;
	}

	public String getCommofityId() {
		return commofityId;
	}

	public void setCommofityId(String commofityId) {
		this.commofityId = commofityId;
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
