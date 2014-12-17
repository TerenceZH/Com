package com.model;

import java.io.Serializable;
import java.util.ArrayList;

public class ImportBill extends PortBill implements Serializable{
	
	public ImportBill() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ImportBill(String id, int type, String customer, String businessman,
			String operator, String warehouse,
			ArrayList<String> portListIdList, String desc, double total,
			String time, int isApproved) {
		super(id, type, customer, businessman, operator, warehouse, portListIdList, desc, total, time, isApproved);
	}


	
}
