package com.sunny.service.dao;

import java.util.List;

//�Ż�ȯ�ӿ�
public interface ConponConfigDao {
	public int addConpon(String s); // ����Ż�ȯ��Ʒ

	public int updateConpon(String s); // �޸��Ż�ȯ��Ʒ

	public int updateConponStatus(int id); // �Ż�ȯ���¼�

	public List queryConponListAll();// �鿴�Ż�ȯ�б�

	public String queryConponDetail(int id);// �鿴�����Ż�ȯ��ϸ �������� ʣ��������

	public String queryCononReceiveDetail(int id);// �鿴�û���ȡ�Ż�ȯ����

	public String queryCononReceiveAll();// �鿴�����û���ȡ�Ż�ȯ����
}
