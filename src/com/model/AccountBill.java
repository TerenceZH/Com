package com.model;

import java.util.ArrayList;

public class AccountBill {
	
	private String id;
	private String operator;
	private ArrayList<String> idList;
	private String time;
	private double total;
	private int isApproved;
	
	public AccountBill(){}
	
	public AccountBill(String id, String operator, ArrayList<String> idList,
			String time, double total, int isApproved) {
		super();
		this.id = id;
		this.operator = operator;
		this.idList = idList;
		this.time = time;
		this.total = total;
		this.isApproved = isApproved;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public ArrayList<String> getIdList() {
		return idList;
	}
	public void setIdList(ArrayList<String> idList) {
		this.idList = idList;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}
	
	

}
