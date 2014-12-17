package com.exception;

public class SKFKException extends MyException{
	public SKFKException(){
		this("SKFKException");
	}
	
	public SKFKException(String msg){
		super(msg);
	}

}
