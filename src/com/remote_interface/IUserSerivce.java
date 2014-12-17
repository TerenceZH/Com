package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.model.Power;
import com.model.Users;

public interface IUserSerivce extends Remote{
	/**登陆*/
	public Power login(String username,String password)throws RemoteException;
	/**登出*/
	public void logout() throws RemoteException;
	/**返回user*/
	public Users getUser(String username,String password)throws RemoteException;
	/**添加用户*/
	public void addUser(Users u)throws RemoteException;
	/**修改权限*/
	public void modUser(Users u)throws RemoteException;
	/**返回User*/
	public Users getUser(String name)throws RemoteException;
	/**是否存在*/
	public boolean isExist(String name)throws RemoteException;
	
	public void confirm(String id) throws RemoteException;
	
	/**
	 * hello
	 * @param id
	 * @return
	 * @throws RemoteException
	 */
	public String getMessage(String id) throws RemoteException;
}
