package com.sunny.service.vo.log;

public class Log_Kefu {
	//��ͨ�ͷ���Ϣ���ͼ�¼
	public int ids;//���
	public long sendTime;//����ʱ��
	public int sendStatus;//����״̬
	public String sendContent;//��������
	public int receiveUser;//������
	public int sessionId;//�Ựid
	public int parentId;//��Id
	public int reMark;//��ע 
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
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
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getReMark() {
		return reMark;
	}
	public void setReMark(int reMark) {
		this.reMark = reMark;
	}
	
}
