package com.sunny.service.dao;

import java.util.List;

//设备绑定信息 接口
public interface DeviceBindDao {
	public int bindDevice(int simId, int deviceId, String bindUser);// 设备绑定

	public int modifyDevice(String s);// 设备修改

	public int delDevice(int id);// 设备删除

	public String queryDeviceBindDetail(int id);// 获取单个绑定详情

	public List queryDeviceBindListAll();// 获取绑定列表
}
