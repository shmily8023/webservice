package com.sunny.service.dao;

public interface TeacherInfoDao {


	public int addTeacherInfo(); // ���

	public int modifyTeacherInfo(); // �޸�

	public int delTeacherInfo(); // ɾ��

	public int checkTeacherInfo(); // ����

	public int queryTeacherInfoLog();// ��ѯ���н�ʦ��Ϣ

	public int queryTeacherInfoLog(String s);// ����ָ��������ѯ��ʦ��Ϣ

}
