package com.sunny.service.vo.log;

public class Log_Task {

//==========����ƻ���¼=============//
	public int ids;//���
	public String taskName;// �ƻ�������
	public String taskCron;// �ƻ�������ʽ
	public String taskExecuteResult;// �ƻ�����ִ�н��
	public long taskExecuteTime;// �ƻ�����ִ��ʱ��
	public String taskClassName; // ִ������
	public String taskMethodName; // ִ�з�����
	public String taskReMark;//��ע
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
