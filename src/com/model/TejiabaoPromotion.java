package com.model;

import java.io.Serializable;
import java.util.ArrayList;

public class TejiabaoPromotion extends Promotion implements Serializable{
	private ArrayList<String> commodityList;
	private double cutNum;
	private String time;

	public TejiabaoPromotion() {
		// TODO Auto-generated constructor stub
		super();
	}

	public TejiabaoPromotion(ArrayList<String> commodityList, double cutNum,
			String beginTime, String endTime,String time) {
		super(beginTime,endTime);
		this.commodityList = commodityList;
		this.cutNum = cutNum;
		this.time = time;
	}

	public ArrayList<String> getCommodityList() {
		return commodityList;
	}

	public void setCommodityList(ArrayList<String> commodityList) {
		this.commodityList = commodityList;
	}

	public double getCutNum() {
		return cutNum;
	}

	public void setCutNum(double cutNum) {
		this.cutNum = cutNum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	
}
