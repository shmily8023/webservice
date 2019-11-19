package com.sunny.service.vo.log;

public class Log_Send {
	// =======发送记录============//
	public int ids;//编号
	public int sendType;// 发送类型：短信发送记录 邮箱发送记录 模板消息发送记录 微信消息发送记录
	public long sendTime;// 发送时间
	public int sendStatus;// 发送状态
	public String sendContent;// 发送内容
	public int receiveUser;// 接受人
	public String reMark;//备注 重发订单短信 重发订单模板消息
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
