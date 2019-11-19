package com.sunny.service.dao;

import java.util.List;

//计划任务 接口
public interface TaskDao {
	public int addTaskInfo(String s); // 添加任务

	public int modifyTaskInfo(int id); // 修改任务

	public int delTaskInfo(int id); // 删除

	public int setTaskInfoSwitch(boolean status); // 开关 启用停用

	public List addTaskExecuteLog(String s);// 计划任务执行记录

	public List queryTaskExecuteLog();// 计划任务执行记录

}
