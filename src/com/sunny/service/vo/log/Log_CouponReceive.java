package com.sunny.service.vo.log;

public class Log_CouponReceive {
//=========�Ż�ȯ��ȡ��¼=========//
	public int ids;// //�Ż�ȯ��ȡ����
	public String receiveUserId;// ��ȡ�û�Id
	public long receiveTime;// ��ȡʱ��
	public long useTime;// ʹ��ʱ��
	public int useStatus;// ʹ������
	public int useType;// ��ȡ����
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getReceiveUserId() {
		return receiveUserId;
	}
	public void setReceiveUserId(String receiveUserId) {
		this.receiveUserId = receiveUserId;
	}
	public long getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(long receiveTime) {
		this.receiveTime = receiveTime;
	}
	public long getUseTime() {
		return useTime;
	}
	public void setUseTime(long useTime) {
		this.useTime = useTime;
	}
	public int getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(int useStatus) {
		this.useStatus = useStatus;
	}
	public int getUseType() {
		return useType;
	}
	public void setUseType(int useType) {
		this.useType = useType;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
