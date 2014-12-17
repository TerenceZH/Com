package com.model;

import java.io.Serializable;

public class Message implements Serializable{
	private Users from;
	private Users to;
	private String text;
	private String time;
	private int isRead;
	

	public Message(Users from, Users to, String text, String time, int isRead) {
		super();
		this.from = from;
		this.to = to;
		this.text = text;
		this.time = time;
		this.isRead = isRead;
	}


	public Users getFrom() {
		return from;
	}


	public void setFrom(Users from) {
		this.from = from;
	}


	public Users getTo() {
		return to;
	}


	public void setTo(Users to) {
		this.to = to;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getIsRead() {
		return isRead;
	}


	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}
	
	
	

}
