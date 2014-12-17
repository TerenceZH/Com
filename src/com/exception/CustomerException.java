package com.exception;

public class CustomerException  extends MyException{
	public CustomerException(){
		this("CustomerException");
	}
	
	public CustomerException(String msg){
		super(msg);
	}

}
