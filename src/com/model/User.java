package com.model;

import java.io.Serializable;

public class User implements Serializable{
	private String username;
	private String password;
	private int type;
	private int getTopAuthority;

	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public User(String username, String password, int type, int getTopAuthority) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
		this.getTopAuthority = getTopAuthority;
	}

	

	public int getGetTopAuthority() {
		return getTopAuthority;
	}



	public void setGetTopAuthority(int getTopAuthority) {
		this.getTopAuthority = getTopAuthority;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	

}
