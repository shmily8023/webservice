package com.sunny.service.vo.log;

public class Log_Send {
	// =======���ͼ�¼============//
	public int ids;//���
	public int sendType;// �������ͣ����ŷ��ͼ�¼ ���䷢�ͼ�¼ ģ����Ϣ���ͼ�¼ ΢����Ϣ���ͼ�¼
	public long sendTime;// ����ʱ��
	public int sendStatus;// ����״̬
	public String sendContent;// ��������
	public int receiveUser;// ������
	public String reMark;//��ע �ط��������� �ط�����ģ����Ϣ
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getSendType() {
		return sendType;
	}
	public void setSendType(int sendType) {
		this.sendType = sendType;
	}
	public long getSendTime() {
		return sendTime;
	}
	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}
	public int getSendStatus() {
		return sendStatus;
	}
	public void setSendStatus(int sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getSendContent() {
		return sendContent;
	}
	public void setSendContent(String sendContent) {
		this.sendContent = sendContent;
	}
	public int getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(int receiveUser) {
		this.receiveUser = receiveUser;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}

	
}
