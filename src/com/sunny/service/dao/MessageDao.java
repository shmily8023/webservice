package com.sunny.service.dao;
//��Ϣ�ӿ�

public interface MessageDao {
	public int sendSms();// ���Ͷ���

	public int sendWxMessage();// ����΢����Ϣ

	public int sendWxTempleteMessage();// ����΢��ģ����Ϣ

	public int sendChatMessage();// ����������Ϣ

	public int sendIndexNotice();// ������ҳ֪ͨ

	public int sendCustomerNotice();// �����������ڲ�֪ͨ

	public int sendSupplyNotice();// ���͹�Ӧ���ڲ�֪ͨ

	public int sendProxyNotice();// ���ʹ������ڲ�֪ͨ

	public int sendKefuMessage();// ����socket�ͷ���Ϣ

	public int receiveKefuMessage();// ����socket�ͷ���Ϣ

	public int getKefuMessage();// ��ȡ�ͷ���¼
}
