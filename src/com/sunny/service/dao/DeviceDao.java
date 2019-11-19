package com.sunny.service.dao;

import java.util.List;

//设备接口
public interface DeviceDao {
	public int addDevice(String s); // 添加设备

	public int modifyDevice(String s);// 修改设备

	public int delDevice(int id);// 删除设备

	public List queryDeviceList(String s);// 根据条件查询设备

	public List queryDeviceListAll();// 查询设备所有列表

	public String queryDeviceDetail(int id);// 查询设备详情

}
