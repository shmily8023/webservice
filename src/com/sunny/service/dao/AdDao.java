package com.sunny.service.dao;

import java.util.List;

public interface AdDao {
//广告相关接口
	public int addAdConfig(String s);// 广告添加 验证页 产品页 首页 结果页

	public int updateAdConfig(String s);// 广告修改

	public int delAdConfig(int id);// 广告删除

	public List queryAdList(String s);// 查看广告列表[可传参 获取部分]-- 包含启用 停用

	public List queryAdListAll();// 查看所有广告列表

	public String queryAdDetail(int id);// 查看广告详细 CPC CPM 剩余 投放位置

	public int addAdLog(String s);// 广告记录添加

	public int queryAdUseLog(String userId);// 广告记录查询 ：返回 cpc cpm 使用记录

	public int queryAdLog(String userId);// 广告记录查询 ：返回 cpc cpm 总记录

	public int addAdChargeLog(String s);// 广告充值记录添加

	public int queryAdChargeLog(String s);// 广告充值记录查询
}
