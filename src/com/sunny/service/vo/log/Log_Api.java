package com.sunny.service.vo.log;

public class Log_Api {
//==========�ӿڵ�����־===========//
	public int ids;//���
	public String apiId;// //apiid
	public long callTime;// ����ʱ��
	public String callIP;// ����Ip
	public String callAddress; // ���õ�ַ �����ص���
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
