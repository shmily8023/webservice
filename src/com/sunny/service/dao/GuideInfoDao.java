package com.sunny.service.dao;

import java.util.List;

//������Ϣ
public interface GuideInfoDao {
	public int addGuideInfo(String s); // ��ӵ�����Ϣ

	public int modifyGuideInfo(String s);// �޸ĵ�����Ϣ

	public int checkGuideInfo(int id);// У�鵼����Ϣ

	public List queryGuideInfoListAll();// ��ѯ���е�����Ϣ

	public List queryGuideInfoList(String s);// ����ָ��������ѯ������Ϣ

	public String queryGuideInfoDetail();// ��ȡ������ϸ��Ϣ
}
