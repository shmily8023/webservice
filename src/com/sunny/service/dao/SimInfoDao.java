package com.sunny.service.dao;

//sim �ӿ�
public interface SimInfoDao {
	public int addSimInfo(); // ���

	public int modifySimInfo(); // �޸�

	public int delSimInfo(); // ɾ��

	public int checkSimInfo(); // ����

	public int setSimSwitch(); // ���� ֹͣ

	public int addSimCharge();// sim��ֵ��¼

	public int querySimChargeLog();// ��ѯsim��ֵ��¼

	public int querySimChargeLog(String s);// ����ָ��������ѯsim��ֵ��¼

}
