package com.zpply.test;

import com.zpply.Utils;

/**
 * @author admin
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils az=new Utils();
		//String m=az.getBatchCode("849523238");
		String c=az.getOrderInfo("wx157179835134981736");
		//wx157179835134981736
		System.out.print(c);
		//调用模板消息
	}
//订单回调
	//发送模板消息
}
