package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.CommodityCategory;

public interface ICommodityService extends Remote{
	/**
	 * ���ݸ��ڵ�������
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<CommodityCategory> queryCategoryByParentNo(String no)throws RemoteException;
	/**
	 * ��ӷ���  �Զ����ɱ��  ����������Ʒ����������ӷ���
	 * @param name  �����ظ� dialog
	 * @param parentNo 
	 * @throws RemoteException
	 */
	public void addCommodityCategory(String name,String parentNo,String operator)throws RemoteException;
	/**
	 * ���ݱ�Ż�÷���
	 * @param no 
	 * @return �����ڷ���null
	 * @throws RemoteException
	 */
	public CommodityCategory getCategory(String no)throws RemoteException;
	/**
	 * �޸ķ���
	 * @param name
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public void modCommodityCategory(String name,String no,String operator)throws RemoteException;
	/**
	 * ɾ������  ���������ӷ��������Ʒ����ɾ��
	 * @param no
	 * @throws RemoteException
	 */
	public void delCommdoityCategory(String no,String operator)throws RemoteException;
	
	
	
	
	
	/**��ӷ���*/ 
	public void addCommodityCategory(String name,CommodityCategory fathercc)throws RemoteException;
	/**ɾ������*/
	public void delCommodityCategory(CommodityCategory cc)throws RemoteException;
	/**��ʾ����*/
	public ArrayList<CommodityCategory> showCommodityCategory(int parentid) throws RemoteException;
	/**��ѯ����*/
	public CommodityCategory queryCommodityCategory(int id)throws RemoteException;
	/**�޸ķ���*/
	public void modCmmodityCategory(CommodityCategory cc)throws RemoteException;
	/**���ఴť��ʾ״̬*/
	public boolean isAble(CommodityCategory cc)throws RemoteException;
	/**���ఴť��ʾ״̬*/
	public boolean isAble(int id)throws RemoteException;
	/**������Ʒ*/
	public void addCommodity(Commodity c)throws RemoteException;
	/**ɾ����Ʒ*/
	public void delCommodity(Commodity c)throws RemoteException;
	/**�޸���Ʒ*/
	public void modCommodity(Commodity c)throws RemoteException;
	/**������Ʒ type,1=all,2=id,3=keyword,4=cateid*/
	public ArrayList<Commodity> queryCommodity(int type,String keyword)throws RemoteException;
	/**��������Ʒid*/
	public String getCommodityId(String name)throws RemoteException;
	/**ɾ����ť��ʾ״̬*/
	public boolean delIsAble(Commodity c)throws RemoteException;
	/**��ȡ���������Ʒ�ķ���*/
	public ArrayList<String> getCategory()throws RemoteException;
	/**��ȡcateid*/
	public int gteCateid(String name)throws RemoteException;
	
}
