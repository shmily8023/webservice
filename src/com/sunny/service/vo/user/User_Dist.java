package com.sunny.service.vo.user;

public class User_Dist {

//分销用户表--固定
	public String userOpenId; // 用户 OpenId
	public int level; // 级别
	public int registerTime; // 登记时间
	public int parentId; // 父级用户Id 第一级为空
	public String getUserOpenId() {
		return userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(int registerTime) {
		this.registerTime = registerTime;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
}
