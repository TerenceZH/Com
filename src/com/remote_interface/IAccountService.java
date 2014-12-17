package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Account;

public interface IAccountService extends Remote{

	public void addAccount(Account a)throws RemoteException;
	public void modAccount(Account a)throws RemoteException;
	public ArrayList<Account> queryAccount(String name)throws RemoteException;
}
