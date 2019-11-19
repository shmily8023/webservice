package com.sunny.service.vo.log;

public class Log_Feedback {
//============意见反馈记录============//
	public int ids;//编号
	public String feedbackUserId;//
	public long feedbackTime;//
	public int feddbackStatus;//反馈状态
	public String feedbackContent;//反馈内容
	public String receiveUserId;//答复用户
	public long receiveTime;//答复时间
	public int receiveContent;//答复内容
	public String reMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getFeedbackUserId() {
		return feedbackUserId;
	}
	public void setFeedbackUserId(String feedbackUserId) {
		this.feedbackUserId = feedbackUserId;
	}
	public long getFeedbackTime() {
		return feedbackTime;
	}
	public void setFeedbackTime(long feedbackTime) {
		this.feedbackTime = feedbackTime;
	}
	public int getFeddbackStatus() {
		return feddbackStatus;
	}
	public void setFeddbackStatus(int feddbackStatus) {
		this.feddbackStatus = feddbackStatus;
	}
	public String getFeedbackContent() {
		return feedbackContent;
	}
	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
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
	public int getReceiveContent() {
		return receiveContent;
	}
	public void setReceiveContent(int receiveContent) {
		this.receiveContent = receiveContent;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
	
}
