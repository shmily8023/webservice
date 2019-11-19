package com.sunny.service.dao;

//sim 接口
public interface SimInfoDao {
	public int addSimInfo(); // 添加

	public int modifySimInfo(); // 修改

	public int delSimInfo(); // 删除

	public int checkSimInfo(); // 核验

	public int setSimSwitch(); // 启用 停止

	public int addSimCharge();// sim充值记录

	public int querySimChargeLog();// 查询sim充值记录

	public int querySimChargeLog(String s);// 根据指定条件查询sim充值记录

}
