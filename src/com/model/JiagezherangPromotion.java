package com.model;

import java.io.Serializable;

public class JiagezherangPromotion extends Promotion implements Serializable{
	private String time;
	private int discount1,discount2,discount3,discount4,discount5;

	public JiagezherangPromotion() {
		// TODO Auto-generated constructor stub
		super();
	}

	public JiagezherangPromotion(String time, String beginTime, String endTime,
			int discount1, int discount2, int discount3, int discount4,
			int discount5) {
		super(beginTime,endTime);
		this.time = time;
		this.discount1 = discount1;
		this.discount2 = discount2;
		this.discount3 = discount3;
		this.discount4 = discount4;
		this.discount5 = discount5;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}


	public int getDiscount1() {
		return discount1;
	}

	public void setDiscount1(int discount1) {
		this.discount1 = discount1;
	}

	public int getDiscount2() {
		return discount2;
	}

	public void setDiscount2(int discount2) {
		this.discount2 = discount2;
	}

	public int getDiscount3() {
		return discount3;
	}

	public void setDiscount3(int discount3) {
		this.discount3 = discount3;
	}

	public int getDiscount4() {
		return discount4;
	}

	public void setDiscount4(int discount4) {
		this.discount4 = discount4;
	}

	public int getDiscount5() {
		return discount5;
	}

	public void setDiscount5(int discount5) {
		this.discount5 = discount5;
	}

	
}
