package com.sunny.service.vo.base;

public class DeviceBind {
	
//设备绑定关系表
	public int ids;//编号
	public int deviceId;//设备Id
	public int simId;	//SimId
	public long bindTime;	//绑定时间
	public String bindUser;	//绑定用户
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
