package com.sunny.service.dao;

import java.util.List;

//优惠券接口
public interface ConponConfigDao {
	public int addConpon(String s); // 添加优惠券产品

	public int updateConpon(String s); // 修改优惠券产品

	public int updateConponStatus(int id); // 优惠券上下架

	public List queryConponListAll();// 查看优惠券列表

	public String queryConponDetail(int id);// 查看单个优惠券详细 发放数量 剩余数量等

	public String queryCononReceiveDetail(int id);// 查看用户领取优惠券详情

	public String queryCononReceiveAll();// 查看单个用户领取优惠券所有
}
