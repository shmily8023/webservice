package com.sunny.service.dao;

import java.util.List;

//�豸�ӿ�
public interface DeviceDao {
	public int addDevice(String s); // ����豸

	public int modifyDevice(String s);// �޸��豸

	public int delDevice(int id);// ɾ���豸

	public List queryDeviceList(String s);// ����������ѯ�豸

	public List queryDeviceListAll();// ��ѯ�豸�����б�

	public String queryDeviceDetail(int id);// ��ѯ�豸����

}
