package com.sunny.service.dao;

public interface SystemConfigDao {
public int setOpenSystemSwitch(boolean status);//����ϵͳ
public int setOpenBalanceSwitch(boolean status);//������Ǯ
public int setGuideMpSwitch(boolean status);//�Ƿ�������ע���ں�
public int setResourceAddress(int rid);//������Դ�洢��ַ
public int setConsomerCashback(int rate);//���õֿ۱���
public int setComsumtionDeduction(int rate);//���õֿ۱��� 0-100
public int setFirstGift(int num);//�����״����ͻ���
public int setSystemConfig(String s);
//��վ����
//��վ����
//��վ������
//��˾��ַ
//��ϵ�绰

}
