package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Message;
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
	 * 修改密码;dialog
	 * @param user 当前用户
	 * @param password 新密码
	 * @throws RemoteException
	 */
	public void modifyPassword(User user,String password)throws RemoteException;
	/**
	 * 添加用户;用户名是否存在；dialog
	 * @param name
	 * @param pwd
	 * @param type
	 * @param auth
	 * @throws RemoteException
	 */
	public void addUser(String name,String pwd,int type,int auth)throws RemoteException;
	/**
	 * 获得用户信息;用户是否存在;
	 * @param name
	 * @return
	 * @throws RemoteException
	 */
	public User getUser(String name)throws RemoteException;
	/**
	 * 修改用户最高权限;用户是否存在;dialog
	 * @param name
	 * @param auth
	 * @throws RemoteException
	 */
	public void modUser(String name,int auth)throws RemoteException;
	/**
	 * 获取消息
	 * @param user
	 * @param type  所有?0:1
	 * @return 如果没有则返回 空array
	 * @throws RemoteException
	 */
	public ArrayList<Message> getMessage(User user,int type) throws RemoteException;
}
