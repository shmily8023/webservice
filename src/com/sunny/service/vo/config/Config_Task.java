package com.sunny.service.vo.config;

public class Config_Task {
//周期任务计划配置
	public String taskName; // 任务名
	public String taskCron; // 任务cron表达式
	public int taskAddTime;// //任务添加时间
	public int taskStatus;// //任务状态:停用 启用
	public String taskAddUser; // 任务创建用户
	public String taskExecuteClassName; // 执行类名
	public String taskExecuteMethodName;// 执行方法名
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskCron() {
		return taskCron;
	}
	public void setTaskCron(String taskCron) {
		this.taskCron = taskCron;
	}
	public int getTaskAddTime() {
		return taskAddTime;
	}
	public void setTaskAddTime(int taskAddTime) {
		this.taskAddTime = taskAddTime;
	}
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskAddUser() {
		return taskAddUser;
	}
	public void setTaskAddUser(String taskAddUser) {
		this.taskAddUser = taskAddUser;
	}
	public String getTaskExecuteClassName() {
		return taskExecuteClassName;
	}
	public void setTaskExecuteClassName(String taskExecuteClassName) {
		this.taskExecuteClassName = taskExecuteClassName;
	}
	public String getTaskExecuteMethodName() {
		return taskExecuteMethodName;
	}
	public void setTaskExecuteMethodName(String taskExecuteMethodName) {
		this.taskExecuteMethodName = taskExecuteMethodName;
	}

}
