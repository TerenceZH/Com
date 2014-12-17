package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Customer;

public interface ICustomerService extends Remote {
	/**添加客户*/
	public void addCustomer(Customer c)throws RemoteException;
	/**修改客户*/
	public void modCustomer(Customer c)throws RemoteException;
	/**查找*/
	public ArrayList<Customer> queryAllCustomer()throws RemoteException;
	public ArrayList<Customer> queryCustomerByKeyword(String s)throws RemoteException;
}
