package com.exception;

public abstract class MyException extends Exception{
	
	public MyException(String msg){
		super(msg+"  Error!");
	}

}
