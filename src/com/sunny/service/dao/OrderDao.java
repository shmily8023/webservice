package com.sunny.service.dao;

public interface OrderDao {
	//=========
	public void insertOrder();// 创建订单 h5创建 后台消费创建
	public int addOrder();// 订单记录-添加  --非核验[从身份证读取器获取｜或者已经核验]
	public void addPftOrder(String ac,String pw,String lid,String tid,String tprice,String tnum,String paytime,String ordertel,String contacttel,String cardId);//添加票付通订单 余额不足返回122
	public void queryPftOrder(String ac,String pw,String pftOrder,String remoteOrder);//返回订单有效期  姓名 订单状态 验证时间 总金额 凭证码 游玩日期
	public void queryPftCode(String ac,String pw,String ordernm,String m);//查询票付通凭证码
	public String verifyPftOrder(String cookies,String order);//票付通模拟验证 返回json字符串
	public int resolvePftVerifyString();//解析票付通验证字符串
	//票付通订单回调 产品回调 
	//================
	public void verifyOrder();// 验证订单

	public void reVerifyOrder();// 撤销订单

	public void queryOrderList();// 查询订单列表

	public void queryOrderDetail();// 查询单个订单详细 验证状态

	public void queryOrderSummary();// 订单汇总

	public void queryOrderAccessDetail();// 获取订单出入访问列表明细
	
	public int updateOrder();// //修改订单状态 验证 未验证
	
	/////============
	public int addOrderReVerifyLog();// 订单撤回

	public int addOrderVerifyLog();// 验证记录
	//==============
	public int getOrderSmsSendNum();// 获取订单短信发送次数
}
