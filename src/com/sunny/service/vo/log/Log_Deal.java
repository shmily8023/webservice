package com.sunny.service.vo.log;

public class Log_Deal {
//==========������Ϣ��¼==========//
	public int ids;// ���
	public long payTime;// ֧��ʱ��
	public int payType;// ���׷�ʽ[΢�� ֧���� ��Ǯ]
	public int buyType3;// ���� �ֽ�
	public int payMethod;// ���׷�ʽ2 JSAPI APP CɨB,BɨC.. ����ʱ�д���Ϣ
	
	public int orderId;// ����Id
	public int comment;// ���ױ�ע
	public double amount;// ʵ�ʽ��׽��
	public String mpId;// //���ں�id
	public String mchId;// //�̻���
	public String productComment; // ��Ʒ����
	public String productDetail; // ��Ʒ����
	public String CurrencyType; // ��������
	public String payUserOpenId;// //�û�Openid
	public int dealStatus;// //����״̬
	public int dealAttr;// //�������� �������� �����˿� ��ҵ�����Ǯ ΢�ź�� ������� ���񸶿� �����̿۽ɱ�֤�� �Ź������˿� �Ź���������
	public String reMark;// ��ע

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
