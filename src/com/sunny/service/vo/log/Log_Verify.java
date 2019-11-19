package com.sunny.service.vo.log;

public class Log_Verify {
	//======验证记录=============//
	public int ids;//编号
	public int oderId;// 订单Id
	public long verifyTime;// 验证时间
	public int verifyNum;// 验证数量
	public int verifyUser;// 验证用户
	public int verifyType;// 验证方式 闸机 终端机 小程序 公众号 h5 pc app
	public int deviceId;// 操作设备号--验证
	public String verifyApiInfo;//// 验证接口信息 ---appid
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
	public long getVerifyTime() {
		return verifyTime;
	}
	public void setVerifyTime(long verifyTime) {
		this.verifyTime = verifyTime;
	}
	public int getVerifyNum() {
		return verifyNum;
	}
	public void setVerifyNum(int verifyNum) {
		this.verifyNum = verifyNum;
	}
	public int getVerifyUser() {
		return verifyUser;
	}
	public void setVerifyUser(int verifyUser) {
		this.verifyUser = verifyUser;
	}
	public int getVerifyType() {
		return verifyType;
	}
	public void setVerifyType(int verifyType) {
		this.verifyType = verifyType;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getVerifyApiInfo() {
		return verifyApiInfo;
	}
	public void setVerifyApiInfo(String verifyApiInfo) {
		this.verifyApiInfo = verifyApiInfo;
	}
	
}
