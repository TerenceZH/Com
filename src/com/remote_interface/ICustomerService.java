package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Customer;

public interface ICustomerService extends Remote {
	/**
	 * 添加客户   编号自动生成 
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
	 * 由编号取得客户信息
	 * @param no 是否存在
	 * @return  不存在null
	 * @throws RemoteException
	 */
	public Customer queryCustomer(String no)throws RemoteException;
	/**
	 * 修改客户
	 * @param no  是否存在
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
