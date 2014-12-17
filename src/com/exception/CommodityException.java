package com.exception;

public class CommodityException extends MyException{
	public CommodityException(){
		this("COmmodityException");
	}
	
	public CommodityException(String msg){
		super(msg);
	}

}
