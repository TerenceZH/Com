package com.model;

import java.io.Serializable;

public class Users implements Serializable{
	private String username;
	private String password;
	private Power type;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String username, String password, Power type) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Power getType() {
		return type;
	}

	public void setType(Power type) {
		this.type = type;
	}
	
	

}
