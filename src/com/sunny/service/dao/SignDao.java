package com.sunny.service.dao;

public interface SignDao {
//ǩ������
	public int getIsSign();// �ж��Ƿ�����ǩ��

	public int getSign();// ��ȡ��ǰǩ������

	public int getConSign();// ��ȡ����ǩ������Ļ���ֵ

	public int checkSign();// ���ǩ��

	public int setSignConfig(); // ǩ������

	public int setConSignConfig(); // ����ǩ������

	public int getSignConfigList();// ��ȡǩ������ֵ

	public int getConSignConfigList();// ��ȡ����ǩ������ֵ
}
