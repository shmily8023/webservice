package com.sunny.service.dao;

import java.util.List;

//�ƻ����� �ӿ�
public interface TaskDao {
	public int addTaskInfo(String s); // �������

	public int modifyTaskInfo(int id); // �޸�����

	public int delTaskInfo(int id); // ɾ��

	public int setTaskInfoSwitch(boolean status); // ���� ����ͣ��

	public List addTaskExecuteLog(String s);// �ƻ�����ִ�м�¼

	public List queryTaskExecuteLog();// �ƻ�����ִ�м�¼

}
