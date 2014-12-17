package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.CommodityCategory;

public interface ICommodityService extends Remote{
	/**添加分类*/ 
	public void addCommodityCategory(String name,CommodityCategory fathercc)throws RemoteException;
	/**删除分类*/
	public void delCommodityCategory(CommodityCategory cc)throws RemoteException;
	/**显示分类*/
	public ArrayList<CommodityCategory> showCommodityCategory(int parentid) throws RemoteException;
	/**查询分类*/
	public CommodityCategory queryCommodityCategory(int id)throws RemoteException;
	/**修改分类*/
	public void modCmmodityCategory(CommodityCategory cc)throws RemoteException;
	/**分类按钮显示状态*/
	public boolean isAble(CommodityCategory cc)throws RemoteException;
	/**分类按钮显示状态*/
	public boolean isAble(int id)throws RemoteException;
	/**增加商品*/
	public void addCommodity(Commodity c)throws RemoteException;
	/**删除商品*/
	public void delCommodity(Commodity c)throws RemoteException;
	/**修改商品*/
	public void modCommodity(Commodity c)throws RemoteException;
	/**查找商品 type,1=all,2=id,3=keyword,4=cateid*/
	public ArrayList<Commodity> queryCommodity(int type,String keyword)throws RemoteException;
	/**获生成商品id*/
	public String getCommodityId(String name)throws RemoteException;
	/**删除按钮显示状态*/
	public boolean delIsAble(Commodity c)throws RemoteException;
	/**获取可以添加商品的分类*/
	public ArrayList<String> getCategory()throws RemoteException;
	/**获取cateid*/
	public int gteCateid(String name)throws RemoteException;
	
}
