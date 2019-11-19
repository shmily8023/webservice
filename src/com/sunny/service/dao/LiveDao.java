package com.sunny.service.dao;

import java.util.List;

//直播接口
public interface LiveDao {
	public int addLive(String s);// 添加直播信息

	public int modifyLive(String s);// 修改直播信息

	public int delLive(int id);// 删除直播信息

	public int setLiveSwitch(boolean open);// 设置直播开关

	public List queryLiveListAll();// 查询所有直播列表信息

	public List queryLiveList(String s);// 查询指定的直播列表

	public int queryLiveDetail(int id);// 查询指定直播详情
}
