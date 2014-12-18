package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Message;
import com.model.User;

public interface IUserService extends Remote{
	/**
	 * ��½�ж��Ƿ�ƥ��
	 * @param username
	 * @param password
	 * @return  ��������򷵻�user������null 
	 * @throws RemoteException
	 */
	public User getUser(String username,String password)throws RemoteException;
	/**
	 * �޸�����;dialog
	 * @param user ��ǰ�û�
	 * @param password ������
	 * @throws RemoteException
	 */
	public void modifyPassword(User user,String password)throws RemoteException;
	/**
	 * ����û�;�û����Ƿ���ڣ�dialog
	 * @param name
	 * @param pwd
	 * @param type
	 * @param auth
	 * @throws RemoteException
	 */
	public void addUser(String name,String pwd,int type,int auth,String operator)throws RemoteException;
	/**
	 * ����û���Ϣ;id�Ƿ����
	 * @param id
	 * @return
	 * @throws RemoteException
	 */
	public User getUser(String id)throws RemoteException;
	/**
	 * �޸��û����Ȩ��;�û��Ƿ����;dialog
	 * @param name
	 * @param auth
	 * @throws RemoteException
	 */
	public void modUser(String name,int auth,String operator)throws RemoteException;
	/**
	 * ��ȡ��Ϣ
	 * @param user
	 * @param type  ����?0:1
	 * @return ���û���򷵻� ��array
	 * @throws RemoteException
	 */
	public ArrayList<Message> getMessage(User user,int type) throws RemoteException;

}
