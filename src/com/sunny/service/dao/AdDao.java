package com.sunny.service.dao;

import java.util.List;

public interface AdDao {
//�����ؽӿ�
	public int addAdConfig(String s);// ������ ��֤ҳ ��Ʒҳ ��ҳ ���ҳ

	public int updateAdConfig(String s);// ����޸�

	public int delAdConfig(int id);// ���ɾ��

	public List queryAdList(String s);// �鿴����б�[�ɴ��� ��ȡ����]-- �������� ͣ��

	public List queryAdListAll();// �鿴���й���б�

	public String queryAdDetail(int id);// �鿴�����ϸ CPC CPM ʣ�� Ͷ��λ��

	public int addAdLog(String s);// ����¼���

	public int queryAdUseLog(String userId);// ����¼��ѯ ������ cpc cpm ʹ�ü�¼

	public int queryAdLog(String userId);// ����¼��ѯ ������ cpc cpm �ܼ�¼

	public int addAdChargeLog(String s);// ����ֵ��¼���

	public int queryAdChargeLog(String s);// ����ֵ��¼��ѯ
}
