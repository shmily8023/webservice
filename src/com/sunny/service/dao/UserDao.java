package com.sunny.service.dao;

import java.util.List;

public interface UserDao {
	//�ͷ��û�����
	public void addServiceUser();//���ӿͷ��Ñ�
	public void updateServiceStatus();//�޸Ŀͷ�״̬
	public void updateServiceNickName();//�޸Ŀͷ��ǳ�
	public void queryServiceUser();//��ѯ�ͷ��û�
	public void delServiceUser();//ɾ���ͷ��û�

//========
	public int addWxUser();//���΢���û�
	public int setBlockWxUser();//����΢���û�
	public String getPayPassword();//��ȡ֧������
	public int setPayPassword();//����֧������
	public List getWxUserDetailByOpenId();//��ȡ�����û�--Openid
	public List getWxUserDetailById();//��ȡ�����û�--id
	public List getUserByCustomerQuery();////��ȡ�б�--��Ӧ�� ������
	public int setDistUser();//���÷����û�
	public int getDistUser();//��ȡ�����û�
	public int setCurrentUserSign();//���õ�ǰǩ������
	public int resetUserSignInfo();//�����û�ǩ����Ϣ
	//==============

	public void addTicketUser();// ����û�

	public void delTicketUser();// ɾ���û�

	public void updateTicketUserPassword(); // ��������

	public void updateTicketUserVaidDate(); // �����û���Ч��

	public void checkTicketUserLimitProduct(); // ����û����޲�Ʒ

	public void setTicketUserStatus();// �����û�״̬

	public void setTicketUserLimitProduct();// �����û����޲�Ʒ
	//===

	//�û���
	//�û���2
	
	
	//==============��Ӧ���û�
	public void addSupplyUser();// ��ӹ�Ӧ���û�

	public void delSupplyUser();// ɾ����Ӧ���û�

	public void updateSupplyUserPassword(); // ���¹�Ӧ���û�����
	
	
	
	//==============��Ӧ���û�
	public void addProxyUser();// ��ӹ�Ӧ���û�

	public void delProxyUser();// ɾ����Ӧ���û�

	public void updateProxyUserPassword(); // ���¹�Ӧ���û�����
	
	//==============useraddressinfo �û������ջ���ַ
	public int addUserAddressInfo(String s);// ����

	public int modifyUserAddressInfo(String s); // �޸�

	public int delUserAddressInfo(int id); // ɾ��

	public int setUserDefaultAddressSwitch(int id,boolean status); // �Ƿ�Ĭ��
}
