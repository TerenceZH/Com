package com.exception;

public class ExportException extends PortBillException{
	public ExportException(){
		this("ExportException");
	}
	
	public ExportException(String msg){
		super(msg);
	}

}
