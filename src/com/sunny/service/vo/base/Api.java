package com.sunny.service.vo.base;

public class Api {
//====�ӿ���Ϣ��=====//
	public String apiId; // APIID
	public String apiKey;//// APIKEY
	public int vaildDate;// ��Ч��
	public int checkType;// ����·��
	public String applyUser;// ������
	public long applyTime;// ����ʱ��
	public int status;// ����״̬ �Ƿ�ͣ��
	public String checkUser;// �����
	public long checkTime;//���ʱ��
	public int maxCallNumByDay;// ���յ�������
	public int maxCallNumByTotal;// �ܵ�������
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public int getVaildDate() {
		return vaildDate;
	}
	public void setVaildDate(int vaildDate) {
		this.vaildDate = vaildDate;
	}
	public int getCheckType() {
		return checkType;
	}
	public void setCheckType(int checkType) {
		this.checkType = checkType;
	}
	public String getApplyUser() {
		return applyUser;
	}
	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}
	public long getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(long applyTime) {
		this.applyTime = applyTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCheckUser() {
		return checkUser;
	}
	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}
	public int getMaxCallNumByDay() {
		return maxCallNumByDay;
	}
	public void setMaxCallNumByDay(int maxCallNumByDay) {
		this.maxCallNumByDay = maxCallNumByDay;
	}
	public int getMaxCallNumByTotal() {
		return maxCallNumByTotal;
	}
	public void setMaxCallNumByTotal(int maxCallNumByTotal) {
		this.maxCallNumByTotal = maxCallNumByTotal;
	}
	public long getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(long checkTime) {
		this.checkTime = checkTime;
	}

}
