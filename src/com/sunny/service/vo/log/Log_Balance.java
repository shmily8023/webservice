package com.sunny.service.vo.log;

public class Log_Balance {
//====��Ǯ��¼====//
	// ͬʱ��ѯopenId ����Ǯ ��ֽ�� ������� ����
	public int ids;//���
	public int balanceType;// ����¼���� [1 ΢�ų�ֵ��Ǯ| 1��Ǯ����| 2����| 3�˿�| 4��ֽ��| 5����Ǯ|��Ǯת�Ǳ�|�Ǳ�ת��Ǯ]
	public int type;// ���� ��Ǯ|�Ǳ�|ת��
	public String openId;// �û�
	public double amount;// ���
	public long time;// ʱ��
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getBalanceType() {
		return balanceType;
	}
	public void setBalanceType(int balanceType) {
		this.balanceType = balanceType;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
	//
}
