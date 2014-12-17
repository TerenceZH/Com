package com.model;

import java.io.Serializable;

public class CommodityList implements Serializable{
	
	//commodity list in the JHD & XSD
		private String id;
		private String commodityId;
		private String name;
		private String style;
		private int quantity;
		private double perPrice;
		private double total;
		private String desc;
		public CommodityList(String id, String commodityId, String name,
				String style, int quantity, double perPrice, double total,
				String desc) {
			super();
			this.id = id;
			this.commodityId = commodityId;
			this.name = name;
			this.style = style;
			this.quantity = quantity;
			this.perPrice = perPrice;
			this.total = total;
			this.desc = desc;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getCommodityId() {
			return commodityId;
		}
		public void setCommodityId(String commodityId) {
			this.commodityId = commodityId;
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
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPerPrice() {
			return perPrice;
		}
		public void setPerPrice(double perPrice) {
			this.perPrice = perPrice;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		

}
