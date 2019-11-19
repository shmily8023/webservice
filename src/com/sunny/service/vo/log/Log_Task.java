package com.sunny.service.vo.log;

public class Log_Task {

//==========任务计划记录=============//
	public int ids;//编号
	public String taskName;// 计划任务名
	public String taskCron;// 计划任务表达式
	public String taskExecuteResult;// 计划任务执行结果
	public long taskExecuteTime;// 计划任务执行时间
	public String taskClassName; // 执行类名
	public String taskMethodName; // 执行方法名
	public String taskReMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
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
	public String getTaskExecuteResult() {
		return taskExecuteResult;
	}
	public void setTaskExecuteResult(String taskExecuteResult) {
		this.taskExecuteResult = taskExecuteResult;
	}
	public long getTaskExecuteTime() {
		return taskExecuteTime;
	}
	public void setTaskExecuteTime(long taskExecuteTime) {
		this.taskExecuteTime = taskExecuteTime;
	}
	public String getTaskClassName() {
		return taskClassName;
	}
	public void setTaskClassName(String taskClassName) {
		this.taskClassName = taskClassName;
	}
	public String getTaskMethodName() {
		return taskMethodName;
	}
	public void setTaskMethodName(String taskMethodName) {
		this.taskMethodName = taskMethodName;
	}
	public String getTaskReMark() {
		return taskReMark;
	}
	public void setTaskReMark(String taskReMark) {
		this.taskReMark = taskReMark;
	}
	

}
