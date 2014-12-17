package com.exception;

public class MessageException extends MyException{
	public MessageException(String msg){
		super(msg);
	}
	
	public MessageException(){
		this("MessageException");
	}

}
