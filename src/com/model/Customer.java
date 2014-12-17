package com.model;

import java.io.Serializable;

public class Customer implements Serializable{
	private String id;
	private int type;
	private String name;
	private int point;//1 yuan =1 pt
	private int level;//level 1-5 need pts 1,200,2000,10000,80000
	private String phone;
	private String address;
	private String zip;
	private String mail;
	private double max_to_get;
	private double to_pay;
	private double to_get;
	private String default_businessman;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	

	public Customer(String id, int type, String name, int point, int level,
			String phone, String address, String zip, String mail,
			double max_to_get, double to_pay, double to_get,
			String default_businessman) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.point = point;
		this.level = level;
		this.phone = phone;
		this.address = address;
		this.zip = zip;
		this.mail = mail;
		this.max_to_get = max_to_get;
		this.to_pay = to_pay;
		this.to_get = to_get;
		this.default_businessman = default_businessman;
	}




	public int getType() {
		return type;
	}



	public void setType(int type) {
		this.type = type;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getMax_to_get() {
		return max_to_get;
	}

	public void setMax_to_get(double max_to_get) {
		this.max_to_get = max_to_get;
	}

	public double getTo_pay() {
		return to_pay;
	}

	public void setTo_pay(double to_pay) {
		this.to_pay = to_pay;
	}

	public double getTo_get() {
		return to_get;
	}

	public void setTo_get(double to_get) {
		this.to_get = to_get;
	}

	public String getDefault_businessman() {
		return default_businessman;
	}

	public void setDefault_businessman(String default_businessman) {
		this.default_businessman = default_businessman;
	}

	
}