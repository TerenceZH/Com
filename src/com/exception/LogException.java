package com.exception;

public class LogException extends MyException{
	public LogException(){
		this("LogException");
	}
	
	public LogException(String msg){
		super(msg);
	}

}
