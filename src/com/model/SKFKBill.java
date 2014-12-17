package com.model;

import java.io.Serializable;
import java.util.ArrayList;

public class SKFKBill extends AccountBill implements Serializable{
	private int type;// = 0when SK ,=1 when FK
	private String customer;

	public SKFKBill() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public SKFKBill(String id, int type, String customer, String operator,
			String time, ArrayList<String> idList, double total,
			int isApproved) {
		super(id, operator, idList, time, total, isApproved);
		this.type = type;
		this.customer = customer;
	}


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}


	
}
