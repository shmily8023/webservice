package com.sunny.service.vo.user;

public class ServiceUser {
//客服用户
	public int ids;//编号
	public String serviceNickName;// 客服昵称
	public int serviceUserId; // 客服用户OpenId
	public int serviceStatus; // 客服状态
	public long serviceAddTime;// 客服添加时间
	public String serviceAddUser;//添加用户
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getServiceNickName() {
		return serviceNickName;
	}
	public void setServiceNickName(String serviceNickName) {
		this.serviceNickName = serviceNickName;
	}
	public int getServiceUserId() {
		return serviceUserId;
	}
	public void setServiceUserId(int serviceUserId) {
		this.serviceUserId = serviceUserId;
	}
	public int getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(int serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public long getServiceAddTime() {
		return serviceAddTime;
	}
	public void setServiceAddTime(long serviceAddTime) {
		this.serviceAddTime = serviceAddTime;
	}
	public String getServiceAddUser() {
		return serviceAddUser;
	}
	public void setServiceAddUser(String serviceAddUser) {
		this.serviceAddUser = serviceAddUser;
	}
	



}
