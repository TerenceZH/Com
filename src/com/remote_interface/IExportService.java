package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.ExportBill;
import com.model.PortBillItem;

public interface IExportService extends Remote{
	/**
	 * ���ݿͻ���Ż�ô���
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public double getDiscount(String no)throws RemoteException;
	/**
	 * ��ô���ȯ��Ŀ
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public double getDjq(String no)throws RemoteException;
	/**
	 * ��ȡ�����˻��ĵ���
	 * @param i ����ʱ�䵹������ĵ�i��  start from 1 
	 * @return ������������null
	 * @throws RemoteException
	 */
	public ExportBill getCancelableExport(int i)throws RemoteException;
	/**
	 * ������null
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
	
	/**
	 * ��ȡ�͵����йص���Ʒ�б�
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem>getBillItems(String no)throws RemoteException;
	/**
	 * busniessmanĬ����customer��getBusinessman  list��ʽ ��no,price,quantity,total,desc
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
