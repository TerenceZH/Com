package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.ImportBill;

public interface IImportService extends Remote{
	public void addImportBill(ImportBill bill)throws RemoteException;
	public ArrayList<ImportBill> queryImportBill(String time1,String time2)throws RemoteException;
	public String getNewId() throws RemoteException;
}
