package com.sunny.service.vo.config;

public class Config_DistUser {
	//Dist1-Dist3 综合100%
	public int DisConfirmConfig;////分销锁定配置 :连接点击进入锁定 支付锁定
	public int Dist1;//百分比 数值1-100 
	public int Dist2;//百分比 数值1-100 
	public int Dist3;//百分比 数值1-100 
	public int getDisConfirmConfig() {
		return DisConfirmConfig;
	}
	public void setDisConfirmConfig(int disConfirmConfig) {
		DisConfirmConfig = disConfirmConfig;
	}
	public int getDist1() {
		return Dist1;
	}
	public void setDist1(int dist1) {
		Dist1 = dist1;
	}
	public int getDist2() {
		return Dist2;
	}
	public void setDist2(int dist2) {
		Dist2 = dist2;
	}
	public int getDist3() {
		return Dist3;
	}
	public void setDist3(int dist3) {
		Dist3 = dist3;
	}

}
