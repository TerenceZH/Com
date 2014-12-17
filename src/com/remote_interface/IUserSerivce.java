package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.model.User;

public interface IUserSerivce extends Remote{

	/**
	 * 登陆判断是否匹配
	 * @param username
	 * @param password
	 * @return  如果存在则返回user，否则null 
	 * @throws RemoteException
	 */
	public User getUser(String username,String password)throws RemoteException;
	/**
	 * 修改密码
	 * @param user 当前用户
	 * @param password 新密码
	 * @throws RemoteException
	 */
	public void modifyPassword(User user,String password)throws RemoteException;
	
	
	
	
	
	
	/**添加用户*/
	public void addUser(User u)throws RemoteException;
	/**修改权限*/
	public void modUser(User u)throws RemoteException;
	/**返回User*/
	public User getUser(String name)throws RemoteException;
	/**是否存在*/
	public boolean isExist(String name)throws RemoteException;
	
	public void confirm(String id) throws RemoteException;
	

	public String getMessage(String id) throws RemoteException;
}
