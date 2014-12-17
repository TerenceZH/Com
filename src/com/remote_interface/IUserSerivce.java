package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.model.Power;
import com.model.Users;

public interface IUserSerivce extends Remote{
	/**��½*/
	public Power login(String username,String password)throws RemoteException;
	/**�ǳ�*/
	public void logout() throws RemoteException;
	/**����user*/
	public Users getUser(String username,String password)throws RemoteException;
	/**����û�*/
	public void addUser(Users u)throws RemoteException;
	/**�޸�Ȩ��*/
	public void modUser(Users u)throws RemoteException;
	/**����User*/
	public Users getUser(String name)throws RemoteException;
	/**�Ƿ����*/
	public boolean isExist(String name)throws RemoteException;
	
	public void confirm(String id) throws RemoteException;
}
