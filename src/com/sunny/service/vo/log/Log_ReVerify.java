package com.sunny.service.vo.log;

public class Log_ReVerify {
	// ������֤��¼ ��ȡ��֤��¼ ִ�г�������α�ǲ����ٴ���֤[��ʾ��ȷ����֤�����Ϳ�����]
	public int ids;//���
	public int oderId;// ����Id
	public long revVerifyTime;// ������֤ʱ��
	public int reVerifyNum;// ������֤����
	public int reVerifyUser;// ������֤�û�
	public int reVerifyPrice;// �����۸� �µ��۸�
	public int optDevice;// �����豸�� ������֤���豸���
	public int refundType;// �˿�����[΢�� ֧���� |���п�]--��ȡ����֧����ʽ ԭ·�˿������ֶ�
	public int refundStatus;// �˻�״̬ ��ʱ�˿�--�ƻ����� ����ֶ�ִ�С���
	public double refundAmount;// �˻ؽ��
//�˿��¼ ����  �˿����͡����������˿� �˿��ⲿ���� ������
	public long refund_completeTime;// �˻�ʱ��
	public long refund_executeTime;// �˻�ִ��ʱ��
	public String refundExternalNumber;// �ⲿ������
	public String reVerifyApiInfo;// ������֤�ӿ���Ϣ
	public int refundApiInfo;// �˿�ӿ���Ϣ
	public String reMark;//��ע
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOderId() {
		return oderId;
	}
	public void setOderId(int oderId) {
		this.oderId = oderId;
	}
	public long getRevVerifyTime() {
		return revVerifyTime;
	}
	public void setRevVerifyTime(long revVerifyTime) {
		this.revVerifyTime = revVerifyTime;
	}
	public int getReVerifyNum() {
		return reVerifyNum;
	}
	public void setReVerifyNum(int reVerifyNum) {
		this.reVerifyNum = reVerifyNum;
	}
	public int getReVerifyUser() {
		return reVerifyUser;
	}
	public void setReVerifyUser(int reVerifyUser) {
		this.reVerifyUser = reVerifyUser;
	}
	public int getReVerifyPrice() {
		return reVerifyPrice;
	}
	public void setReVerifyPrice(int reVerifyPrice) {
		this.reVerifyPrice = reVerifyPrice;
	}
	public int getOptDevice() {
		return optDevice;
	}
	public void setOptDevice(int optDevice) {
		this.optDevice = optDevice;
	}
	public int getRefundType() {
		return refundType;
	}
	public void setRefundType(int refundType) {
		this.refundType = refundType;
	}
	public int getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(int refundStatus) {
		this.refundStatus = refundStatus;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public long getRefund_completeTime() {
		return refund_completeTime;
	}
	public void setRefund_completeTime(long refund_completeTime) {
		this.refund_completeTime = refund_completeTime;
	}
	public long getRefund_executeTime() {
		return refund_executeTime;
	}
	public void setRefund_executeTime(long refund_executeTime) {
		this.refund_executeTime = refund_executeTime;
	}
	public String getRefundExternalNumber() {
		return refundExternalNumber;
	}
	public void setRefundExternalNumber(String refundExternalNumber) {
		this.refundExternalNumber = refundExternalNumber;
	}
	public String getReVerifyApiInfo() {
		return reVerifyApiInfo;
	}
	public void setReVerifyApiInfo(String reVerifyApiInfo) {
		this.reVerifyApiInfo = reVerifyApiInfo;
	}
	public int getRefundApiInfo() {
		return refundApiInfo;
	}
	public void setRefundApiInfo(int refundApiInfo) {
		this.refundApiInfo = refundApiInfo;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
