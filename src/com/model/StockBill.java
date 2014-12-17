package com.model;

import java.io.Serializable;

public class StockBill implements Serializable{
	private String id;
	private int type;//=0 if more than sth,=1 if less than sth,=2 if less than warning num ,=3 when a giving bill is created
	private int quantity;//=0 when type=2
	private String time;
	private int isApproved;

	public StockBill() {
		// TODO Auto-generated constructor stub
	}
	
	

	public StockBill(String id, int type, int quantity, String time,int isApproved) {
		super();
		this.id = id;
		this.type = type;
		this.quantity = quantity;
		this.time = time;
		this.isApproved = isApproved;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}



	public int getIsApproved() {
		return isApproved;
	}



	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}

	
}
