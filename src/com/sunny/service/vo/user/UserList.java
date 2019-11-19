package com.sunny.service.vo.user;

public class UserList {
//总用户表
	//表状态: 那个表
	//表id
	public int ids;//serial id
	public int userType;//use type. use a 
	public String userOpenId;//
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getUserOpenId() {
		return userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}
	
}
