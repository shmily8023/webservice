package com.sunny.service.dao;

import java.util.List;

public interface ApiDao {
//api
	public int applyApi(String s);// ����api�ӿ�

	public int checkApi(int id); // ���api�ӿ�

	public int updateApiStatus(int id, boolean status); // ͣ���ýӿ�

	public int updateApiCallNum(int id, int cpc, int cpm); // �޸ĵ�������

	public int delApi(int id); // ɾ���ӿ�

	public List queryApiInfoListAll();// �鿴api �б�

	public String queryApiInfoDetail();// �鿴����api��ϸ��Ϣ

	public int addApiLog(String s);// API���ü�¼���

	public int queryApiUseLog(String appid);// ����appid �Ѿ��ĵ��� �µ���������

	public int queryApiLog(String appid);// ����appid�ĵ��� �µ���������
}
