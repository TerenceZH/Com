package com.exception;

public class PortBillException extends MyException{
	public PortBillException(){
		this("PortBillException");
	}
	
	public PortBillException(String msg){
		super(msg);
	}

}
