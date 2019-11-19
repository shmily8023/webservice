package com.sunny.service.vo.log;

public class Log_ReVerify {
	// 撤销验证记录 获取验证记录 执行撤销。如何标记不可再次验证[显示正确可验证数量就可以了]
	public int ids;//编号
	public int oderId;// 订单Id
	public long revVerifyTime;// 撤销验证时间
	public int reVerifyNum;// 撤销验证数量
	public int reVerifyUser;// 撤销验证用户
	public int reVerifyPrice;// 撤销价格 下单价格
	public int optDevice;// 操作设备号 撤销验证的设备编号
	public int refundType;// 退款类型[微信 支付宝 |银行卡]--获取订单支付方式 原路退款并插入此字段
	public int refundStatus;// 退回状态 延时退款--计划任务 标记字段执行。。
	public double refundAmount;// 退回金额
//退款记录 关联  退款类型。撤销订单退款 退款外部订单 订单号
	public long refund_completeTime;// 退回时间
	public long refund_executeTime;// 退回执行时间
	public String refundExternalNumber;// 外部订单号
	public String reVerifyApiInfo;// 撤销验证接口信息
	public int refundApiInfo;// 退款接口信息
	public String reMark;//备注
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOderId() {
		return oderId;
	}
	public void setOderId(int oderId) {
		this.oderId = oderId;
	}
	public long getRevVerifyTime() {
		return revVerifyTime;
	}
	public void setRevVerifyTime(long revVerifyTime) {
		this.revVerifyTime = revVerifyTime;
	}
	public int getReVerifyNum() {
		return reVerifyNum;
	}
	public void setReVerifyNum(int reVerifyNum) {
		this.reVerifyNum = reVerifyNum;
	}
	public int getReVerifyUser() {
		return reVerifyUser;
	}
	public void setReVerifyUser(int reVerifyUser) {
		this.reVerifyUser = reVerifyUser;
	}
	public int getReVerifyPrice() {
		return reVerifyPrice;
	}
	public void setReVerifyPrice(int reVerifyPrice) {
		this.reVerifyPrice = reVerifyPrice;
	}
	public int getOptDevice() {
		return optDevice;
	}
	public void setOptDevice(int optDevice) {
		this.optDevice = optDevice;
	}
	public int getRefundType() {
		return refundType;
	}
	public void setRefundType(int refundType) {
		this.refundType = refundType;
	}
	public int getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(int refundStatus) {
		this.refundStatus = refundStatus;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public long getRefund_completeTime() {
		return refund_completeTime;
	}
	public void setRefund_completeTime(long refund_completeTime) {
		this.refund_completeTime = refund_completeTime;
	}
	public long getRefund_executeTime() {
		return refund_executeTime;
	}
	public void setRefund_executeTime(long refund_executeTime) {
		this.refund_executeTime = refund_executeTime;
	}
	public String getRefundExternalNumber() {
		return refundExternalNumber;
	}
	public void setRefundExternalNumber(String refundExternalNumber) {
		this.refundExternalNumber = refundExternalNumber;
	}
	public String getReVerifyApiInfo() {
		return reVerifyApiInfo;
	}
	public void setReVerifyApiInfo(String reVerifyApiInfo) {
		this.reVerifyApiInfo = reVerifyApiInfo;
	}
	public int getRefundApiInfo() {
		return refundApiInfo;
	}
	public void setRefundApiInfo(int refundApiInfo) {
		this.refundApiInfo = refundApiInfo;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	
}
