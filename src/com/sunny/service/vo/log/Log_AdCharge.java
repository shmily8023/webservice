package com.sunny.service.vo.log;

public class Log_AdCharge {
//=====广告充值记录======//
	//===广告用户---供应商用户
	public int ids;//编号
	public String chargeUser;//充值用户
	public long chargeTime;//充值时间
	public int chargeType;//充值类型 0-CPC  1 CPM
	public int chargeNum;//充值数量
	public String reMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getChargeUser() {
		return chargeUser;
	}
	public void setChargeUser(String chargeUser) {
		this.chargeUser = chargeUser;
	}
	public long getChargeTime() {
		return chargeTime;
	}
	public void setChargeTime(long chargeTime) {
		this.chargeTime = chargeTime;
	}
	public int getChargeType() {
		return chargeType;
	}
	public void setChargeType(int chargeType) {
		this.chargeType = chargeType;
	}
	public int getChargeNum() {
		return chargeNum;
	}
	public void setChargeNum(int chargeNum) {
		this.chargeNum = chargeNum;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}

}
