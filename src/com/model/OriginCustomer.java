package com.model;

public class OriginCustomer {
	private String name;
	private int type;
	private String phone;
	private double to_get;
	private double to_pay;
	private int accountId;

	public OriginCustomer() {
		// TODO Auto-generated constructor stub
	}

	public OriginCustomer(String name, int type, String phone, double to_get,
			double to_pay, int accountId) {
		super();
		this.name = name;
		this.type = type;
		this.phone = phone;
		this.to_get = to_get;
		this.to_pay = to_pay;
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getTo_get() {
		return to_get;
	}

	public void setTo_get(double to_get) {
		this.to_get = to_get;
	}

	public double getTo_pay() {
		return to_pay;
	}

	public void setTo_pay(double to_pay) {
		this.to_pay = to_pay;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	

}
