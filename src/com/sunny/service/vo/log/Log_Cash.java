package com.sunny.service.vo.log;

public class Log_Cash {
	// =====������˼�¼=====//
	// �Ƿ������Զ���� ˭ӵ�����Ȩ��:��Ӧ�� ƽ̨��
	public int ids;// ���
	public long applyTime;// ����ʱ��
	public long checkTime;//���ʱ��
	public String applyUser;// �����û�
	public double applyAmount;// ������
	public int cashType;// ���ַ�ʽ ΢�� ֧���� ���п�
	public String cashAccount;// �����˺�
	public int cashStatus;// �������ģʽ [�Զ�|�ֶ�] �Զ� �ύ�Զ������˿�ֶ�-���üƻ�����
	public int applyStatus;// ����-���� ״̬
	public String mobilePhone;// �ֻ���
	public String rejectComment;// �ܾ�����
	public String reMark;// ��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public long getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(long applyTime) {
		this.applyTime = applyTime;
	}
	public long getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(long checkTime) {
		this.checkTime = checkTime;
	}
	public String getApplyUser() {
		return applyUser;
	}
	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}
	public double getApplyAmount() {
		return applyAmount;
	}
	public void setApplyAmount(double applyAmount) {
		this.applyAmount = applyAmount;
	}
	public int getCashType() {
		return cashType;
	}
	public void setCashType(int cashType) {
		this.cashType = cashType;
	}
	public String getCashAccount() {
		return cashAccount;
	}
	public void setCashAccount(String cashAccount) {
		this.cashAccount = cashAccount;
	}
	public int getCashStatus() {
		return cashStatus;
	}
	public void setCashStatus(int cashStatus) {
		this.cashStatus = cashStatus;
	}
	public int getApplyStatus() {
		return applyStatus;
	}
	public void setApplyStatus(int applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getRejectComment() {
		return rejectComment;
	}
	public void setRejectComment(String rejectComment) {
		this.rejectComment = rejectComment;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
