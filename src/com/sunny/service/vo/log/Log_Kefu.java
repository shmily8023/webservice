package com.sunny.service.vo.log;

public class Log_Kefu {
	//普通客服消息发送记录
	public int ids;//编号
	public long sendTime;//发送时间
	public int sendStatus;//发送状态
	public String sendContent;//发送内容
	public int receiveUser;//接受人
	public int sessionId;//会话id
	public int parentId;//父Id
	public int reMark;//备注 
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
