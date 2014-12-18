package com.remote_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.model.Commodity;
import com.model.CommodityCategory;

public interface ICommodityService extends Remote{
	/**
	 * 根据父节点查找类别
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<CommodityCategory> queryCategoryByParentNo(String no)throws RemoteException;
	/**
	 * 添加分类  自动生成编号  分类下有商品不能再添加子分类
	 * @param name  不能重复 dialog
	 * @param parentNo 
	 * @throws RemoteException
	 */
	public void addCommodityCategory(String name,String parentNo,String operator)throws RemoteException;
	/**
	 * 根据编号获得分类
	 * @param no 
	 * @return 不存在返回null
	 * @throws RemoteException
	 */
	public CommodityCategory getCategory(String no)throws RemoteException;
	/**
	 * 修改分类
	 * @param name
	 * @param no
	 * @return
	 * @throws RemoteException
	 */
	public void modCommodityCategory(String name,String no,String operator)throws RemoteException;
	/**
	 * 删除分类  分类下有子分类或者商品不能删除
	 * @param no
	 * @throws RemoteException
	 */
	public void delCommdoityCategory(String no,String operator)throws RemoteException;
	/**
	 * 获取所有可以添加商品分类，该分类下木有子分类
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<CommodityCategory> getAllCommodityCategories()throws RemoteException;
	/**
	 * 添加商品，编号自动生成 其他默认0
	 * @param name
	 * @param style
	 * @param type  分类的名称，先找到编号、、、
	 * @param inprice
	 * @param outprice
	 * @param warning
	 * @throws RemoteException
	 */
	public void addCommodity(String name,String style,String type,double inprice,double outprice,int warning,String operator)throws RemoteException;
	/**
	 * 根据编号来查询  是否存在 
	 * @param no
	 * @throws RemoteException
	 */
	public Commodity queryCommodity(String no)throws RemoteException;
	/**
	 * 可以手动修改的值
	 * @param no
	 * @param inprice
	 * @param outprice
	 * @param warning
	 * @throws RemoteException
	 */
	public void modCommodity(String no,double inprice,double outprice,int warning,String operator)throws RemoteException;
	/**
	 * 删除商品，是否存在
	 * @param no
	 * @param operator
	 * @throws RemoteException
	 */
	public void delCommodity(String no,String operator)throws RemoteException;
	
	
	
	
	
	
	
	
	
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
