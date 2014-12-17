package com.model;

import java.io.Serializable;

public class OriginBankAccount implements Serializable{
	
	private String name;
	private double money;
	private int accountId;

	public OriginBankAccount() {
		// TODO Auto-generated constructor stub
	}

	public OriginBankAccount(String name, double money, int accountId) {
		super();
		this.name = name;
		this.money = money;
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	

}
