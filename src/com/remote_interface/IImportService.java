package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.ImportBill;
import com.model.PortBillItem;

public interface IImportService extends Remote{
	/**
	 * ������  ����Զ�����  dialog  type=0���� 1�˻�
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
	 * ��ȡ�����˻��ĵ���
	 * @param i ����ʱ�䵹������ĵ�i��  start from 1 
	 * @return ������������null
	 * @throws RemoteException
	 */
	public ImportBill getCancelableImport(int i)throws RemoteException;
	/**
	 * ��ȡ�͵����йص���Ʒ�б�
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<PortBillItem>getBillItems(String no)throws RemoteException;
	/**
	 * ���ݱ�Ż����Ʒ   
	 * @param no
	 * @return  ������null
	 * @throws RemoteException
	 */
	public Commodity getCommodity(String no)throws RemoteException;
}
