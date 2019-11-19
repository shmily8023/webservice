package com.sunny.service.dao;

import java.util.List;

public interface ApiDao {
//api
	public int applyApi(String s);// 申请api接口

	public int checkApi(int id); // 审核api接口

	public int updateApiStatus(int id, boolean status); // 停启用接口

	public int updateApiCallNum(int id, int cpc, int cpm); // 修改调用数量

	public int delApi(int id); // 删除接口

	public List queryApiInfoListAll();// 查看api 列表

	public String queryApiInfoDetail();// 查看单个api详细信息

	public int addApiLog(String s);// API调用记录添加

	public int queryApiUseLog(String appid);// 查找appid 已经的单日 月调用数据量

	public int queryApiLog(String appid);// 查找appid的单日 月调用数据量
}
