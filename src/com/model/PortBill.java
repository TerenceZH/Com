package com.model;

import java.util.ArrayList;

public class PortBill {
	
	private String id;
	private int type;
	private String customer;
	private String businessman;
	private String operator;
	private String warehouse;
	private ArrayList<String> portListIdList;
	private String desc;
	private double total;
	private String time;
	private int isApproved;
	
	
	
	public PortBill(String id, int type, String supplier, String businessman,
			String operator, String warehouse,
			ArrayList<String> portListIdList, String desc, double total,
			String time, int isApproved) {
		super();
		this.id = id;
		this.type = type;
		this.customer = supplier;
		this.businessman = businessman;
		this.operator = operator;
		this.warehouse = warehouse;
		this.portListIdList = portListIdList;
		this.desc = desc;
		this.total = total;
		this.time = time;
		this.isApproved = isApproved;
	}
	
	public PortBill() {
		// TODO Auto-generated constructor stub
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
	public String getSupplier() {
		return customer;
	}
	public void setSupplier(String supplier) {
		this.customer = supplier;
	}
	public String getBusinessman() {
		return businessman;
	}
	public void setBusinessman(String businessman) {
		this.businessman = businessman;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public ArrayList<String> getPortListIdList() {
		return portListIdList;
	}
	public void setPortListIdList(ArrayList<String> portListIdList) {
		this.portListIdList = portListIdList;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
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
