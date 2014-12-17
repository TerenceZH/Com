package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.CommodityCategory;

public interface ICommodityService extends Remote{
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
