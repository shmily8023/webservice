package com.sunny.service.vo.config;

public class Config_Gate {

//闸机配置
	public int ids;// 编号
	public int gateId;// //闸机编号
	public String acceptDate;// //那些天可以出入
	public String acceptTime; // 那些时间段可以出入

	public int getIds() {
		return ids;
	}

	public void setIds(int ids) {
		this.ids = ids;
	}

	public int getGateId() {
		return gateId;
	}

	public void setGateId(int gateId) {
		this.gateId = gateId;
	}

	public String getAcceptDate() {
		return acceptDate;
	}

	public void setAcceptDate(String acceptDate) {
		this.acceptDate = acceptDate;
	}

	public String getAcceptTime() {
		return acceptTime;
	}

	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}

}
