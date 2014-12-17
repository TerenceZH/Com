package com.func;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CommonFunc {
	/**
	 * 商品分类id转换为长度为3的字符串
	 * @param id
	 * @return
	 */
	public static String categoryidToString(int id){
		return id<10?"00"+id:(id<100?"0"+id:""+id);
	}

	public static String time(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(new Date());
	}
	
	public static String billidToString(String id){
		int temp = Integer.parseInt(id);
		return temp<10?"0000"+temp:(temp<100?"000"+temp:(temp<1000?"00"+temp:(temp<10000?"0"+temp:""+temp)));
	}
}
