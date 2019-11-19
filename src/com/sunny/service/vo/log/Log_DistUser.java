package com.sunny.service.vo.log;

public class Log_DistUser {
//============分销用户表===============/
	public int ids;//编号
	public int userId;//分销用户编号
	public int subId;//下级用户id
	public int level;//级别
	//select ids,level from distuserLog where userId='' order by limit 1  返回ids
	//select sid from disuserlog where level=level+1 and ids=(返回的ids); //返回sid数组
	//select userId from disuerlog where subid='';// sid 为数组
	//=======================
//根据OpenId数组 并且 开启分销 计算总订单数 总订单金额
	//根据单个openId 并且开启分销 查询订单明细
	//根据openId 查询基本信息
	/////////////////////////
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	
}
