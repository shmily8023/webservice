package com.sunny.service.vo.log;

public class Log_AccountsList {
//========���˼�¼��==========//
	// order����� ����id Ĭ��Ϊ�� ���ɶ���ʱ ���ö��˱��
	public int ids;// ���
	public int orderId;// �������
	public double orderAmount; // �������
	public int checkId; // ���˱��
	public double refundAmount;// //�˿���--�ڶ���������˿���
	public String accountId; // ��ͬ���
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getCheckId() {
		return checkId;
	}
	public void setCheckId(int checkId) {
		this.checkId = checkId;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}

}
