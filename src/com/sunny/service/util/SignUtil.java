package com.sunny.service.util;

public class SignUtil {
//签到方法
	
	public boolean getIsConSign(String id) {
		return true;
//判断是否连续签到
	}

	public int getSign(String id) {
		return 3;
		// 根据用户 获取当前已签到天数
	}

	public int getConSign(int myid) {
		//获取已经连续签到所额外获取的积分值
		int mys=0;
		switch (myid) {
		case 1:
			mys = 1;
			// System.out.println("test:"+1);
			break;
		case 2:
			mys = 2;
			// System.out.println("test:"+2);
			 break;
		case 3:
			mys = 3;
			// System.out.println("test:"+3);
			 break;
		case 4:
			mys = 4;
			 //System.out.println("test:"+4);
			 break;
		case 5:
			mys = 5;
			// System.out.println("test:"+5);
			 break;
		case 6:
			mys = 6;
			// System.out.println("test:"+6);
			 break;
		case 7:
			mys = 7;
			// System.out.println("test:"+7);
			 break;
		case 8:
			mys = 8;
			// System.out.println("test:"+8);
			 break;
		}
		return mys;
		// 获取再签到的数
	}

	public void checkSign(String id) {

		int m = getSign(id);
		if (m <= 1) {
			// 第一次签到 记录签到
			System.out.print(m);
		} else {
			boolean isCon = getIsConSign("1");// 判断是否连续签到
			if (isCon == true) {
				int a = 3;// 已经签到的天数
 int myc=getConSign(a);
 System.out.println("额外奖励:"+myc);
				// 获取已经连续签到的天数
				// 获取再签到的额外奖励
			} else {
				// 不连续签到。。 重新计算签到 配置签到天数为0

			}
			// 检查是否连续签到
			//System.out.print("else:" + m);
		}
	}
}
