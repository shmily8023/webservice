package com.sunny.service.dao;

public interface BackUpDao {
//���ݻָ��ӿ�

	public int addBackUpLog(String s);// ���ݼ�¼���
	public int queryBackUpLog(String s);// ���ݼ�¼����
	public int addRestoreLog(String s);// �ָ���¼���
	public int queryRestoreLog(String s);// �ָ���¼����
	public int executeBackUp();//ִ�б��� ȫ�� ����
	public int executeRestore();//ִ�лָ�
}
