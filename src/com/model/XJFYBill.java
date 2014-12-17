package com.model;

import java.io.Serializable;
import java.util.ArrayList;

public class XJFYBill extends AccountBill implements Serializable{
	private String account;//related account id

	public XJFYBill() {
		// TODO Auto-generated constructor stub
		super();
	}



	public XJFYBill(String id, String operator,
			ArrayList<String> idList, String time, String account,
			double total, int isApproved) {
		super(id, operator, idList, time, total, isApproved);
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	

}
