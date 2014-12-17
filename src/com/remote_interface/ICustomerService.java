package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Customer;

public interface ICustomerService extends Remote {
	/**��ӿͻ�*/
	public void addCustomer(Customer c)throws RemoteException;
	/**�޸Ŀͻ�*/
	public void modCustomer(Customer c)throws RemoteException;
	/**����*/
	public ArrayList<Customer> queryAllCustomer()throws RemoteException;
	public ArrayList<Customer> queryCustomerByKeyword(String s)throws RemoteException;
}
