package com.sunny.service.vo.base;

public class Sim {
	public int ids;// 编号
	public String iccid;// iccid
	public String mobilePhone; // 手机号
	public long regTime;// //注册时间
	public int isOpen;// //是否启用
	public String reMark;// 备注
	public long openTime;// 启用时间
	public long lastOpenTime;// 上一次启用时间
	public long stopTime;// 停止时间
	public int lastStopTime;// 上一次停止时间
	public int consumeByMonth;//月消费
	public String operation;//运营商
	public String regIssue;	// 注册机构/人
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public long getRegTime() {
		return regTime;
	}
	public void setRegTime(long regTime) {
		this.regTime = regTime;
	}
	public int getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(int isOpen) {
		this.isOpen = isOpen;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	public long getOpenTime() {
		return openTime;
	}
	public void setOpenTime(long openTime) {
		this.openTime = openTime;
	}
	public long getLastOpenTime() {
		return lastOpenTime;
	}
	public void setLastOpenTime(long lastOpenTime) {
		this.lastOpenTime = lastOpenTime;
	}
	public long getStopTime() {
		return stopTime;
	}
	public void setStopTime(long stopTime) {
		this.stopTime = stopTime;
	}
	public int getLastStopTime() {
		return lastStopTime;
	}
	public void setLastStopTime(int lastStopTime) {
		this.lastStopTime = lastStopTime;
	}
	public int getConsumeByMonth() {
		return consumeByMonth;
	}
	public void setConsumeByMonth(int consumeByMonth) {
		this.consumeByMonth = consumeByMonth;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getRegIssue() {
		return regIssue;
	}
	public void setRegIssue(String regIssue) {
		this.regIssue = regIssue;
	}


}
