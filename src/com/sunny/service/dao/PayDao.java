package com.sunny.service.dao;

public interface PayDao {
	public int addAlipayConfig();// 支付宝配置

	public int updateAlipayConfig();// 支付宝更新配置

	public int addWxPayConfig();// 微信支付配置添加

	public int updateWxPayConfig();// 微信支付配置更新

	public int getCallPay();// 调用支付

	public int getRefundPay();// 订单退款

	public int getSendRedPacket();// 发送企业红包

	public int setSendBalance();// 发送零钱--转账
}
