package com.exception;

public class ImportException extends PortBillException{
	public ImportException(){
		this("ImportException");
	}
	
	public ImportException(String msg){
		super(msg);
	}

}
