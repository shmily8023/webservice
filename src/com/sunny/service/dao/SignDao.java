package com.sunny.service.dao;

public interface SignDao {
//签到配置
	public int getIsSign();// 判断是否连续签到

	public int getSign();// 获取当前签到天数

	public int getConSign();// 获取连续签到额外的积分值

	public int checkSign();// 检查签到

	public int setSignConfig(); // 签到配置

	public int setConSignConfig(); // 连续签到配置

	public int getSignConfigList();// 获取签到配置值

	public int getConSignConfigList();// 获取连续签到配置值
}
