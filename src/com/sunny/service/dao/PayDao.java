package com.sunny.service.dao;

public interface PayDao {
	public int addAlipayConfig();// ֧��������

	public int updateAlipayConfig();// ֧������������

	public int addWxPayConfig();// ΢��֧���������

	public int updateWxPayConfig();// ΢��֧�����ø���

	public int getCallPay();// ����֧��

	public int getRefundPay();// �����˿�

	public int getSendRedPacket();// ������ҵ���

	public int setSendBalance();// ������Ǯ--ת��
}
