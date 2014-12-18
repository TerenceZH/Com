package com.model;

import java.io.Serializable;

import javax.swing.JButton;


public class Message implements Serializable{
	private int id;
	private User from;
	private User to;
	private String text;
	private String time;
	private int isRead;



	public Message(int id, User from, User to, String text, String time,
			int isRead) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.text = text;
		this.time = time;
		this.isRead = isRead;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public User getFrom() {
		return from;
	}



	public void setFrom(User from) {
		this.from = from;
	}



	public User getTo() {
		return to;
	}



	public void setTo(User to) {
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


	
	public Object getMessageValue(int columnNumber){
		switch (columnNumber){
		case 0:
			return getFrom();
		case 1:
			return getTime();
		case 2:
//			return new JButton("ÏêÇé");
			return getText();
		case 3:
			return new JButton("É¾³ý");
		default:
			return "";
		}
	
	}
	
	
	

}
