package com.sunny.service.vo.config;

public class Config_Task {
//��������ƻ�����
	public String taskName; // ������
	public String taskCron; // ����cron���ʽ
	public int taskAddTime;// //�������ʱ��
	public int taskStatus;// //����״̬:ͣ�� ����
	public String taskAddUser; // ���񴴽��û�
	public String taskExecuteClassName; // ִ������
	public String taskExecuteMethodName;// ִ�з�����
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
