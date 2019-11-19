package com.sunny.service.vo.log;

public class Log_SimCharge {

//=====sim 充值记录=====//
	public int ids;//编号
	public int iccid;// iccid
	public long chargeTime;// 充值时间
	public String chargeUser;// 充值用户
	public int chargeAmount;// 充值金额
	public String reMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getIccid() {
		return iccid;
	}
	public void setIccid(int iccid) {
		this.iccid = iccid;
	}
	public long getChargeTime() {
		return chargeTime;
	}
	public void setChargeTime(long chargeTime) {
		this.chargeTime = chargeTime;
	}
	public String getChargeUser() {
		return chargeUser;
	}
	public void setChargeUser(String chargeUser) {
		this.chargeUser = chargeUser;
	}
	public int getChargeAmount() {
		return chargeAmount;
	}
	public void setChargeAmount(int chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
