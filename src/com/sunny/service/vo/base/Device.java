package com.sunny.service.vo.base;

public class Device {
//=====�豸��Ϣ��=====//
	public int ids;// //���
	public int deviceType;// �豸���� բ�� �ն� �Զ�ȡƱ�� app
	public String deviceMac; // �豸mac
	public String deviceSystem; // �豸ϵͳ[ios android]
	public String deviceVersion; // �豸�汾
	public int imei1;
	public int imei2;
	public int meid;//
	public long addTime;// ���ʱ��
	public String addUser;// ����û�
	// �豸s
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceMac() {
		return deviceMac;
	}
	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
	public String getDeviceSystem() {
		return deviceSystem;
	}
	public void setDeviceSystem(String deviceSystem) {
		this.deviceSystem = deviceSystem;
	}
	public String getDeviceVersion() {
		return deviceVersion;
	}
	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}
	public int getImei1() {
		return imei1;
	}
	public void setImei1(int imei1) {
		this.imei1 = imei1;
	}
	public int getImei2() {
		return imei2;
	}
	public void setImei2(int imei2) {
		this.imei2 = imei2;
	}
	public int getMeid() {
		return meid;
	}
	public void setMeid(int meid) {
		this.meid = meid;
	}
	public long getAddTime() {
		return addTime;
	}
	public void setAddTime(long addTime) {
		this.addTime = addTime;
	}
	public String getAddUser() {
		return addUser;
	}
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

}
