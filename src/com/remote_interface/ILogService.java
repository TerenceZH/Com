package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Log;

public interface ILogService extends Remote{
	/**…˙≥…log*/
	public void addLog(Log log)throws RemoteException;
	/**≤È’“log*/
	public ArrayList<Log> queryAllLogs()throws RemoteException;
	public ArrayList<Log> queryByTime(String t1,String t2)throws RemoteException;

}
