package com.sunny.service.vo.base;

public class Device {
//=====设备信息表=====//
	public int ids;// //编号
	public int deviceType;// 设备类型 闸机 终端 自动取票机 app
	public String deviceMac; // 设备mac
	public String deviceSystem; // 设备系统[ios android]
	public String deviceVersion; // 设备版本
	public int imei1;
	public int imei2;
	public int meid;//
	public long addTime;// 添加时间
	public String addUser;// 添加用户
	// 设备s
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
