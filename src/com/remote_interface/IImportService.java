package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.ImportBill;
import com.model.PortBillItem;

public interface IImportService extends Remote{
	/**
	 * 进货单  编号自动生成  dialog  type=0进货 1退货  arraylist<string>s 商品编号，单价，数量，总价 ，desc 的格式
	 * @param customer
	 * @param warehouse
	 * @param operator 
	 * @param desc
	 * @param time  yyyy-MM-dd HH:mm:ss
	 * @param total
	 * @throws RemoteException
	 */
	public void addImport(int type,String customer, String warehouse,String operator, ArrayList<String>s,String desc,String time, double total )throws RemoteException;
	/**
	 * 获取可以退货的单子
	 * @param i 按照时间倒叙排序的第i个  start from 1 
	 * @return 超出个数返回null
	 * @throws RemoteException
	 */
	public ImportBill getCancelableImport(int i)throws RemoteException;
	/**
	 * 获取和单子有关的商品列表
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem>getBillItems(String no)throws RemoteException;
	/**
	 * 根据编号获得商品   
	 * @param no
	 * @return  不存在null
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
}
