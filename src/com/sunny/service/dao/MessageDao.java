package com.sunny.service.dao;
//消息接口

public interface MessageDao {
	public int sendSms();// 发送短信

	public int sendWxMessage();// 发送微信消息

	public int sendWxTempleteMessage();// 发送微信模板消息

	public int sendChatMessage();// 发送聊天消息

	public int sendIndexNotice();// 发送首页通知

	public int sendCustomerNotice();// 发送消费者内部通知

	public int sendSupplyNotice();// 发送供应商内部通知

	public int sendProxyNotice();// 发送代理商内部通知

	public int sendKefuMessage();// 发送socket客服消息

	public int receiveKefuMessage();// 接受socket客服消息

	public int getKefuMessage();// 获取客服记录
}
