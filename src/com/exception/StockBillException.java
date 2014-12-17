package com.exception;

public class StockBillException extends MyException{
	public StockBillException(){
		this("StockBillException");
	}
	
	public StockBillException(String msg){
		super(msg);
	}

}
