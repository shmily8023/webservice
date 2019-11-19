package com.sunny.service.vo.base;

public class Api {
//====接口信息表=====//
	public String apiId; // APIID
	public String apiKey;//// APIKEY
	public int vaildDate;// 有效期
	public int checkType;// 核销路径
	public String applyUser;// 申请人
	public long applyTime;// 申请时间
	public int status;// 申请状态 是否停用
	public String checkUser;// 审核人
	public long checkTime;//审核时间
	public int maxCallNumByDay;// 单日调用数量
	public int maxCallNumByTotal;// 总调用数量
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public int getVaildDate() {
		return vaildDate;
	}
	public void setVaildDate(int vaildDate) {
		this.vaildDate = vaildDate;
	}
	public int getCheckType() {
		return checkType;
	}
	public void setCheckType(int checkType) {
		this.checkType = checkType;
	}
	public String getApplyUser() {
		return applyUser;
	}
	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}
	public long getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(long applyTime) {
		this.applyTime = applyTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCheckUser() {
		return checkUser;
	}
	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}
	public int getMaxCallNumByDay() {
		return maxCallNumByDay;
	}
	public void setMaxCallNumByDay(int maxCallNumByDay) {
		this.maxCallNumByDay = maxCallNumByDay;
	}
	public int getMaxCallNumByTotal() {
		return maxCallNumByTotal;
	}
	public void setMaxCallNumByTotal(int maxCallNumByTotal) {
		this.maxCallNumByTotal = maxCallNumByTotal;
	}
	public long getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(long checkTime) {
		this.checkTime = checkTime;
	}

}
