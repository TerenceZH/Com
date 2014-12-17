package com.model;

import java.io.Serializable;

public class Commodity implements Serializable{
	private String id;
	private String name;
	private String style;
	private int stockQuantity;
	private double inPrice;
	private double salePrice;
	private double lastInPrice;
	private double lastSalePrice;
	private double stockAvgPrice;
	private int warningQuantity;
	private String time;
	private int categoryId;

	public Commodity() {
		// TODO Auto-generated constructor stub
	}

	public Commodity(String id, String name, String style, int stockQuantity,
			double inPrice, double salePrice, double lastInPrice,
			double lastSalePrice, double stockAvgPrice, int warningQuantity,
			String time, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.style = style;
		this.stockQuantity = stockQuantity;
		this.inPrice = inPrice;
		this.salePrice = salePrice;
		this.lastInPrice = lastInPrice;
		this.lastSalePrice = lastSalePrice;
		this.stockAvgPrice = stockAvgPrice;
		this.warningQuantity = warningQuantity;
		this.time = time;
		this.categoryId = categoryId;
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

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public double getInPrice() {
		return inPrice;
	}

	public void setInPrice(double inPrice) {
		this.inPrice = inPrice;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getLastInPrice() {
		return lastInPrice;
	}

	public void setLastInPrice(double lastInPrice) {
		this.lastInPrice = lastInPrice;
	}

	public double getLastSalePrice() {
		return lastSalePrice;
	}

	public void setLastSalePrice(double lastSalePrice) {
		this.lastSalePrice = lastSalePrice;
	}

	public double getStockAvgPrice() {
		return stockAvgPrice;
	}

	public void setStockAvgPrice(double stockAvgPrice) {
		this.stockAvgPrice = stockAvgPrice;
	}

	public int getWarningQuantity() {
		return warningQuantity;
	}

	public void setWarningQuantity(int warningQuantity) {
		this.warningQuantity = warningQuantity;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	
}
