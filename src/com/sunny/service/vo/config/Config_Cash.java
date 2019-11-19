package com.sunny.service.vo.config;

public class Config_Cash {
//提现配置
 
	public int cashSwitch;//提现开关
	public int cashConfig;//	//提现周期配置 每月 每日  每周
	public int cashConfigValByDate;//		//允许提现日期月[1-31] 日[0-24] 每周[1-7] 多个用分隔符分割
	public int cashConfigValByTime;//		//允许提现时间
	public int cashMinAmount;	//最低 提现金额
	public int cashMaxAmount;	//最高体现金额
	public int CoefficientOfWithdrawals;//	//提现系数
	
}
