package com.sunny.service.vo.log;

public class Log_UserAccess {
//用户出入访问记录
	public int ids;//编号
	public int oderId;//所属订单Id
	public int accessType;//读取方式:身份证读取器。二维码扫描器。人脸。
	public int accessTag;//验证方式[订单号/身份证/人脸]
	public int userType;//人员类型 景区固定人员，平台管理人员，临时访问人员
	//临时用户列表
	public long revVerifyTime;//访问时间
	public int reVerifyNum;//访问类型:出门/入门
	public int reVerifyUser;//访问用户
	//多次入场？
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOderId() {
		return oderId;
	}
	public void setOderId(int oderId) {
		this.oderId = oderId;
	}
	public int getAccessType() {
		return accessType;
	}
	public void setAccessType(int accessType) {
		this.accessType = accessType;
	}
	public int getAccessTag() {
		return accessTag;
	}
	public void setAccessTag(int accessTag) {
		this.accessTag = accessTag;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public long getRevVerifyTime() {
		return revVerifyTime;
	}
	public void setRevVerifyTime(long revVerifyTime) {
		this.revVerifyTime = revVerifyTime;
	}
	public int getReVerifyNum() {
		return reVerifyNum;
	}
	public void setReVerifyNum(int reVerifyNum) {
		this.reVerifyNum = reVerifyNum;
	}
	public int getReVerifyUser() {
		return reVerifyUser;
	}
	public void setReVerifyUser(int reVerifyUser) {
		this.reVerifyUser = reVerifyUser;
	}
	
}
