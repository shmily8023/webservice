package com.sunny.service.dao;

import java.util.List;

//ֱ���ӿ�
public interface LiveDao {
	public int addLive(String s);// ���ֱ����Ϣ

	public int modifyLive(String s);// �޸�ֱ����Ϣ

	public int delLive(int id);// ɾ��ֱ����Ϣ

	public int setLiveSwitch(boolean open);// ����ֱ������

	public List queryLiveListAll();// ��ѯ����ֱ���б���Ϣ

	public List queryLiveList(String s);// ��ѯָ����ֱ���б�

	public int queryLiveDetail(int id);// ��ѯָ��ֱ������
}
