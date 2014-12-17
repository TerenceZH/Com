package com.exception;

public class UserException extends MyException{
	public UserException(){
		this("UserException");
	}
	
	public UserException(String msg){
		super(msg);
	}

}
