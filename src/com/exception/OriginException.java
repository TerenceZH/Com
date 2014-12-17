package com.exception;

public class OriginException extends MyException{
	public OriginException(String msg){
		super(msg);
	}
	
	public OriginException(){
		this("OriginException");
	}

}
