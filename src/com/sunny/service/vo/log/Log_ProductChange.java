package com.sunny.service.vo.log;

public class Log_ProductChange {
	// 产品变动记录======= 待修改//
	public int ids;// 编号
	public int changeProductId;// //变动产品
	public int changeType;// 变动类型 增加价格 减少价格 修改信息
	public String changeContent;// 变动 内容 价格 有效期。。。
	public double changeTime;// 变动时间
	public String changeUser;// 修改用户
	
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getChangeProductId() {
		return changeProductId;
	}
	public void setChangeProductId(int changeProductId) {
		this.changeProductId = changeProductId;
	}
	public int getChangeType() {
		return changeType;
	}
	public void setChangeType(int changeType) {
		this.changeType = changeType;
	}
	public String getChangeContent() {
		return changeContent;
	}
	public void setChangeContent(String changeContent) {
		this.changeContent = changeContent;
	}
	public double getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(double changeTime) {
		this.changeTime = changeTime;
	}
	public String getChangeUser() {
		return changeUser;
	}
	public void setChangeUser(String changeUser) {
		this.changeUser = changeUser;
	}
	
}
