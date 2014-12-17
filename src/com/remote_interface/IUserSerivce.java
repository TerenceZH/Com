package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.model.User;

public interface IUserSerivce extends Remote{

	/**
	 * ��½�ж��Ƿ�ƥ��
	 * @param username
	 * @param password
	 * @return  ��������򷵻�user������null 
	 * @throws RemoteException
	 */
	public User getUser(String username,String password)throws RemoteException;
	/**
	 * �޸�����
	 * @param user ��ǰ�û�
	 * @param password ������
	 * @throws RemoteException
	 */
	public void modifyPassword(User user,String password)throws RemoteException;
	
	
	
	
	
	
	/**����û�*/
	public void addUser(User u)throws RemoteException;
	/**�޸�Ȩ��*/
	public void modUser(User u)throws RemoteException;
	/**����User*/
	public User getUser(String name)throws RemoteException;
	/**�Ƿ����*/
	public boolean isExist(String name)throws RemoteException;
	
	public void confirm(String id) throws RemoteException;
	

	public String getMessage(String id) throws RemoteException;
}
