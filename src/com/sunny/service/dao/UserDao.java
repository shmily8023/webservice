package com.sunny.service.dao;

import java.util.List;

public interface UserDao {
	//客服用户管理
	public void addServiceUser();//增加客服用戶
	public void updateServiceStatus();//修改客服状态
	public void updateServiceNickName();//修改客服昵称
	public void queryServiceUser();//查询客服用户
	public void delServiceUser();//删除客服用户

//========
	public int addWxUser();//添加微信用户
	public int setBlockWxUser();//拉黑微信用户
	public String getPayPassword();//获取支付密码
	public int setPayPassword();//设置支付密码
	public List getWxUserDetailByOpenId();//获取单个用户--Openid
	public List getWxUserDetailById();//获取单个用户--id
	public List getUserByCustomerQuery();////获取列表--供应商 代理商
	public int setDistUser();//设置分销用户
	public int getDistUser();//获取分销用户
	public int setCurrentUserSign();//设置当前签到天数
	public int resetUserSignInfo();//重置用户签到信息
	//==============

	public void addTicketUser();// 添加用户

	public void delTicketUser();// 删除用户

	public void updateTicketUserPassword(); // 更新密码

	public void updateTicketUserVaidDate(); // 更新用户有效期

	public void checkTicketUserLimitProduct(); // 检查用户受限产品

	public void setTicketUserStatus();// 设置用户状态

	public void setTicketUserLimitProduct();// 设置用户受限产品
	//===

	//用户绑定
	//用户绑定2
	
	
	//==============供应商用户
	public void addSupplyUser();// 添加供应商用户

	public void delSupplyUser();// 删除供应商用户

	public void updateSupplyUserPassword(); // 更新供应商用户密码
	
	
	
	//==============供应商用户
	public void addProxyUser();// 添加供应商用户

	public void delProxyUser();// 删除供应商用户

	public void updateProxyUserPassword(); // 更新供应商用户密码
	
	//==============useraddressinfo 用户个人收货地址
	public int addUserAddressInfo(String s);// 增加

	public int modifyUserAddressInfo(String s); // 修改

	public int delUserAddressInfo(int id); // 删除

	public int setUserDefaultAddressSwitch(int id,boolean status); // 是否默认
}
