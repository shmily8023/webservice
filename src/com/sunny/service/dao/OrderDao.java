package com.sunny.service.dao;

public interface OrderDao {
	//=========
	public void insertOrder();// �������� h5���� ��̨���Ѵ���
	public int addOrder();// ������¼-���  --�Ǻ���[�����֤��ȡ����ȡ�������Ѿ�����]
	public void addPftOrder(String ac,String pw,String lid,String tid,String tprice,String tnum,String paytime,String ordertel,String contacttel,String cardId);//���Ʊ��ͨ���� ���㷵��122
	public void queryPftOrder(String ac,String pw,String pftOrder,String remoteOrder);//���ض�����Ч��  ���� ����״̬ ��֤ʱ�� �ܽ�� ƾ֤�� ��������
	public void queryPftCode(String ac,String pw,String ordernm,String m);//��ѯƱ��ͨƾ֤��
	public String verifyPftOrder(String cookies,String order);//Ʊ��ͨģ����֤ ����json�ַ���
	public int resolvePftVerifyString();//����Ʊ��ͨ��֤�ַ���
	//Ʊ��ͨ�����ص� ��Ʒ�ص� 
	//================
	public void verifyOrder();// ��֤����

	public void reVerifyOrder();// ��������

	public void queryOrderList();// ��ѯ�����б�

	public void queryOrderDetail();// ��ѯ����������ϸ ��֤״̬

	public void queryOrderSummary();// ��������

	public void queryOrderAccessDetail();// ��ȡ������������б���ϸ
	
	public int updateOrder();// //�޸Ķ���״̬ ��֤ δ��֤
	
	/////============
	public int addOrderReVerifyLog();// ��������

	public int addOrderVerifyLog();// ��֤��¼
	//==============
	public int getOrderSmsSendNum();// ��ȡ�������ŷ��ʹ���
}
