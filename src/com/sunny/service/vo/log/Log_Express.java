package com.sunny.service.vo.log;

public class Log_Express {
//快递单号
	public int ids;//编号
	public int orderId;//订单编号
	public int companyName;//快递公司名称
	public int expressNumber;//单号
	public int sendUser;//发件人
	public long sendTime;//发件时间
	public int sendUserAddress;//发件地址
	public int sendPhoneNumber;//发件号码
	public int receiveUser;
	public int receiveAddress;//收件地址
	public int receivePhoneNumber;//收件手机号码
	public String reMark;//备注
	public int supplyId;//供应商id
	public int proxyId;//代理商Id
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCompanyName() {
		return companyName;
	}
	public void setCompanyName(int companyName) {
		this.companyName = companyName;
	}
	public int getExpressNumber() {
		return expressNumber;
	}
	public void setExpressNumber(int expressNumber) {
		this.expressNumber = expressNumber;
	}
	public int getSendUser() {
		return sendUser;
	}
	public void setSendUser(int sendUser) {
		this.sendUser = sendUser;
	}
	public long getSendTime() {
		return sendTime;
	}
	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}
	public int getSendUserAddress() {
		return sendUserAddress;
	}
	public void setSendUserAddress(int sendUserAddress) {
		this.sendUserAddress = sendUserAddress;
	}
	public int getSendPhoneNumber() {
		return sendPhoneNumber;
	}
	public void setSendPhoneNumber(int sendPhoneNumber) {
		this.sendPhoneNumber = sendPhoneNumber;
	}
	public int getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(int receiveUser) {
		this.receiveUser = receiveUser;
	}
	public int getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(int receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	public int getReceivePhoneNumber() {
		return receivePhoneNumber;
	}
	public void setReceivePhoneNumber(int receivePhoneNumber) {
		this.receivePhoneNumber = receivePhoneNumber;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	public int getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(int supplyId) {
		this.supplyId = supplyId;
	}
	public int getProxyId() {
		return proxyId;
	}
	public void setProxyId(int proxyId) {
		this.proxyId = proxyId;
	}
	
}
