package com.model;

public class OriginCommodity {
	private String id;
	private String name;
	private String style;
	private int inPrice;
	private int salePrice;
	private int lastInPrice;
	private int lastSalePrice;
	private int categoryId;
	private int accountId;

	public OriginCommodity() {
		// TODO Auto-generated constructor stub
	}

	public OriginCommodity(String id, String name, String style, int inPrice,
			int salePrice, int lastInPrice, int lastSalePrice, int categoryId,
			int accountId) {
		super();
		this.id = id;
		this.name = name;
		this.style = style;
		this.inPrice = inPrice;
		this.salePrice = salePrice;
		this.lastInPrice = lastInPrice;
		this.lastSalePrice = lastSalePrice;
		this.categoryId = categoryId;
		this.accountId = accountId;
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

	public int getInPrice() {
		return inPrice;
	}

	public void setInPrice(int inPrice) {
		this.inPrice = inPrice;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getLastInPrice() {
		return lastInPrice;
	}

	public void setLastInPrice(int lastInPrice) {
		this.lastInPrice = lastInPrice;
	}

	public int getLastSalePrice() {
		return lastSalePrice;
	}

	public void setLastSalePrice(int lastSalePrice) {
		this.lastSalePrice = lastSalePrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	

}
