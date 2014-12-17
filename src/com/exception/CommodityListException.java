package com.exception;

public class CommodityListException extends MyException{
	public CommodityListException(){
		this("CommodityListException");
	}
	
	public CommodityListException(String msg){
		super(msg);
	}

}
