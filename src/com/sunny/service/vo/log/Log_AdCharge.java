package com.sunny.service.vo.log;

public class Log_AdCharge {
//=====����ֵ��¼======//
	//===����û�---��Ӧ���û�
	public int ids;//���
	public String chargeUser;//��ֵ�û�
	public long chargeTime;//��ֵʱ��
	public int chargeType;//��ֵ���� 0-CPC  1 CPM
	public int chargeNum;//��ֵ����
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getChargeUser() {
		return chargeUser;
	}
	public void setChargeUser(String chargeUser) {
		this.chargeUser = chargeUser;
	}
	public long getChargeTime() {
		return chargeTime;
	}
	public void setChargeTime(long chargeTime) {
		this.chargeTime = chargeTime;
	}
	public int getChargeType() {
		return chargeType;
	}
	public void setChargeType(int chargeType) {
		this.chargeType = chargeType;
	}
	public int getChargeNum() {
		return chargeNum;
	}
	public void setChargeNum(int chargeNum) {
		this.chargeNum = chargeNum;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}

}
