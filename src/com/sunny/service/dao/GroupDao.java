package com.sunny.service.dao;

import java.util.List;

//�Ŷ����� ��� �ӿ�
public interface GroupDao {

	public int applyGroup(String s);// �Ŷ�����

	public List queryGroup_User(String userId);// �ŶӲ�ѯ-�û�

	public List queryGroup_Supply(String supplyId);// �ŶӲ�ѯ-��Ӧ��

	public int checkGroupTicket(String userId);// Ʊ�����[��Ʊ ���� ����]

	public int importFinance();// �ʽ�����

	public String queryGroup_Print(int id);/// ��ȡ��һ�Ŷ���Ϣ --��ӡ
}
