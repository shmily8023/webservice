package com.sunny.service.vo.log;

public class Log_Cash {
	// =====提现审核记录=====//
	// 是否提现自动审核 谁拥有审核权限:供应商 平台？
	public int ids;// 编号
	public long applyTime;// 申请时间
	public long checkTime;//审核时间
	public String applyUser;// 申请用户
	public double applyAmount;// 申请金额
	public int cashType;// 提现方式 微信 支付宝 银行卡
	public String cashAccount;// 提现账号
	public int cashStatus;// 提现审核模式 [自动|手动] 自动 提交自动调用退款。手动-利用计划任务
	public int applyStatus;// 提现-申请 状态
	public String mobilePhone;// 手机号
	public String rejectComment;// 拒绝理由
	public String reMark;// 备注
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
