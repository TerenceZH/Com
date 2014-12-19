package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.ExportBill;
import com.model.PortBillItem;

public interface IExportService extends Remote{
	/**
	 * 根据客户编号获得打折
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public double getDiscount(String no)throws RemoteException;
	/**
	 * 获得代金券数目
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public double getDjq(String no)throws RemoteException;
	/**
	 * 获取可以退货的单子
	 * @param i 按照时间倒叙排序的第i个  start from 1 
	 * @return 超出个数返回null
	 * @throws RemoteException
	 */
	public ExportBill getCancelableExport(int i)throws RemoteException;
	/**
	 * 不存在null
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
	
	/**
	 * 获取和单子有关的商品列表
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem>getBillItems(String no)throws RemoteException;
	/**
	 * busniessman默认是customer的getBusinessman  list形式 ：no,price,quantity,total,desc
	 * @param type
	 * @param customer
	 * @param warehouse
	 * @param operator
	 * @param preTotal
	 * @param discount
	 * @param djq
	 * @param postTotal
	 * @param desc
	 * @param list
	 * @param time
	 * @throws RemoteException
	 */
	public void addExport(int type,String customer,String warehouse,String operator,double preTotal,double discount,double djq,double postTotal,
			String desc,ArrayList<String>list,String time)throws RemoteException;

}
