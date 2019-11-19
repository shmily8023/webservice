package com.sunny.service.vo.log;

public class Log_Api {
//==========接口调用日志===========//
	public int ids;//编号
	public String apiId;// //apiid
	public long callTime;// 调用时间
	public String callIP;// 调用Ip
	public String callAddress; // 调用地址 检测异地调用
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public long getCallTime() {
		return callTime;
	}
	public void setCallTime(long callTime) {
		this.callTime = callTime;
	}
	public String getCallIP() {
		return callIP;
	}
	public void setCallIP(String callIP) {
		this.callIP = callIP;
	}
	public String getCallAddress() {
		return callAddress;
	}
	public void setCallAddress(String callAddress) {
		this.callAddress = callAddress;
	}

}
