package com.sunny.service.dao;

import java.util.List;

//导游信息
public interface GuideInfoDao {
	public int addGuideInfo(String s); // 添加导游信息

	public int modifyGuideInfo(String s);// 修改导游信息

	public int checkGuideInfo(int id);// 校验导游信息

	public List queryGuideInfoListAll();// 查询所有导游信息

	public List queryGuideInfoList(String s);// 根据指定条件查询导游信息

	public String queryGuideInfoDetail();// 获取导游详细信息
}
