package com.model;

import java.io.Serializable;
import java.util.ArrayList;

public class ExportBill  extends PortBill implements Serializable{

	private double preTotal;
	private double discountTotal;
	private double daijinquan;
	
	public ExportBill() {
		// TODO Auto-generated constructor stub
	}

	public ExportBill(String id, int type, String customer,
			String bussinessman, String operator, String warehouse,
			ArrayList<String> portListIdList, double preTotal,
			double discountTotal, double daijinquan, double total,
			String desc, String time, int isApproved) {
		super(id, type, customer, bussinessman, operator, warehouse, portListIdList, desc, total, time, isApproved);
		this.preTotal = preTotal;
		this.discountTotal = discountTotal;
		this.daijinquan = daijinquan;
		
	}



	
}
