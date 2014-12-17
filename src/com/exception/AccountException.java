package com.exception;

public class AccountException extends MyException{
	public AccountException(){
		this("AccountException");
	}
	
	public AccountException(String msg){
		super(msg);
	}

}
