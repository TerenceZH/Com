package com.exception;

public class PromotionException extends MyException{
	public PromotionException(){
		this("PromotionException");
	}
	
	public PromotionException(String msg){
		super(msg);
	}

}
