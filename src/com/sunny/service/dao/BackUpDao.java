package com.sunny.service.dao;

public interface BackUpDao {
//备份恢复接口

	public int addBackUpLog(String s);// 备份记录添加
	public int queryBackUpLog(String s);// 备份记录查找
	public int addRestoreLog(String s);// 恢复记录添加
	public int queryRestoreLog(String s);// 恢复记录查找
	public int executeBackUp();//执行备份 全量 增量
	public int executeRestore();//执行恢复
}
