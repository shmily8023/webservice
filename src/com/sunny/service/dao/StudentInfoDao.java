package com.sunny.service.dao;

//ѧ����Ϣ�ӿ�
public interface StudentInfoDao {

	public int addStudentInfo(); // ���

	public int modifyStudentInfo(); // �޸�

	public int delStudentInfo(); // ɾ��

	public int checkStudentInfo(); // ����

	public int queryStudentInfoLog();// ��ѯѧ����Ϣ��¼

	public int queryStudentInfoLog(String s);// ����ָ��������ѯѧ����Ϣ��¼
}
