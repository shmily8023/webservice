package com.sunny.service.dao;

//分销配置
public interface DistDao {
	public int addDistLevel(String s); // 添加分销等级

	public int modifyDistLevel(String s); // 修改分销等级

	public int delDistLevel(int id); // 删除分销等级

	public int setDistCombination(int level1, int level2, int level3); // 配置各级分销百分比--分级组合

	public int setDistUserLockMethod(boolean method);// 设置分级用户锁定方式

	public int setDistSwitch(boolean open);// 分级开关--是否开启分销

	public String queryDistLevel();// 查询分销等级
}
