package com.sunny.service.vo.log;

public class Log_Deal {
//==========交易信息记录==========//
	public int ids;// 编号
	public long payTime;// 支付时间
	public int payType;// 交易方式[微信 支付宝 零钱]
	public int buyType3;// 电子 现金
	public int payMethod;// 交易方式2 JSAPI APP C扫B,B扫C.. 购买时有此信息
	
	public int orderId;// 订单Id
	public int comment;// 交易备注
	public double amount;// 实际交易金额
	public String mpId;// //公众号id
	public String mchId;// //商户号
	public String productComment; // 商品描述
	public String productDetail; // 商品详情
	public String CurrencyType; // 货币类型
	public String payUserOpenId;// //用户Openid
	public int dealStatus;// //交易状态
	public int dealAttr;// //交易属性 订单购买 订单退款 企业付款到零钱 微信红包 金额提现 财务付款 代理商扣缴保证金 团购订单退款 团购订单购买
	public String reMark;// 备注

	public int getIds() {
		return ids;
	}

	public void setIds(int ids) {
		this.ids = ids;
	}

	public long getPayTime() {
		return payTime;
	}

	public void setPayTime(long payTime) {
		this.payTime = payTime;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public int getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(int payMethod) {
		this.payMethod = payMethod;
	}


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMpId() {
		return mpId;
	}

	public void setMpId(String mpId) {
		this.mpId = mpId;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getProductComment() {
		return productComment;
	}

	public void setProductComment(String productComment) {
		this.productComment = productComment;
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public String getCurrencyType() {
		return CurrencyType;
	}

	public void setCurrencyType(String currencyType) {
		CurrencyType = currencyType;
	}

	public String getPayUserOpenId() {
		return payUserOpenId;
	}

	public void setPayUserOpenId(String payUserOpenId) {
		this.payUserOpenId = payUserOpenId;
	}

	public int getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(int dealStatus) {
		this.dealStatus = dealStatus;
	}

	public int getDealAttr() {
		return dealAttr;
	}

	public void setDealAttr(int dealAttr) {
		this.dealAttr = dealAttr;
	}

	public String getReMark() {
		return reMark;
	}

	public void setReMark(String reMark) {
		this.reMark = reMark;
	}

}
