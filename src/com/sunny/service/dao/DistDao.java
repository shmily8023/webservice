package com.sunny.service.dao;

//��������
public interface DistDao {
	public int addDistLevel(String s); // ��ӷ����ȼ�

	public int modifyDistLevel(String s); // �޸ķ����ȼ�

	public int delDistLevel(int id); // ɾ�������ȼ�

	public int setDistCombination(int level1, int level2, int level3); // ���ø��������ٷֱ�--�ּ����

	public int setDistUserLockMethod(boolean method);// ���÷ּ��û�������ʽ

	public int setDistSwitch(boolean open);// �ּ�����--�Ƿ�������

	public String queryDistLevel();// ��ѯ�����ȼ�
}
