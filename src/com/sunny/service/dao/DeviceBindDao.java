package com.sunny.service.dao;

import java.util.List;

//�豸����Ϣ �ӿ�
public interface DeviceBindDao {
	public int bindDevice(int simId, int deviceId, String bindUser);// �豸��

	public int modifyDevice(String s);// �豸�޸�

	public int delDevice(int id);// �豸ɾ��

	public String queryDeviceBindDetail(int id);// ��ȡ����������

	public List queryDeviceBindListAll();// ��ȡ���б�
}
