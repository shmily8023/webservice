package com.sunny.service.vo.base;

public class DeviceBind {
	
//�豸�󶨹�ϵ��
	public int ids;//���
	public int deviceId;//�豸Id
	public int simId;	//SimId
	public long bindTime;	//��ʱ��
	public String bindUser;	//���û�
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public int getSimId() {
		return simId;
	}
	public void setSimId(int simId) {
		this.simId = simId;
	}
	public long getBindTime() {
		return bindTime;
	}
	public void setBindTime(long bindTime) {
		this.bindTime = bindTime;
	}
	public String getBindUser() {
		return bindUser;
	}
	public void setBindUser(String bindUser) {
		this.bindUser = bindUser;
	}
	
}
