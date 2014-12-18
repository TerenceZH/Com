package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Customer;

public interface ICustomerService extends Remote {
	/**
	 * ��ӿͻ�   ����Զ����� 
	 * @param name  notnull
	 * @param type
	 * @param address
	 * @param phone
	 * @param zip
	 * @param mail
	 * @param operator
	 * @throws RemoteException
	 */
	public void addCustomer(String name,int type,String address,String phone,String zip,String mail,double max,String operator)throws RemoteException;
	/**
	 * �ɱ��ȡ�ÿͻ���Ϣ
	 * @param no �Ƿ����
	 * @return  ������null
	 * @throws RemoteException
	 */
	public Customer queryCustomer(String no)throws RemoteException;
	/**
	 * �޸Ŀͻ�
	 * @param no  �Ƿ����
	 * @param address
	 * @param phone
	 * @param zip
	 * @param mail
	 * @param max
	 * @param operator
	 * @throws RemoteException
	 */
	public void modCustomer(String no,String address,String phone,String zip,String mail,double max,String operator)throws RemoteException;
	
	
}
