package com.sunny.service.vo.product;

public class ProductArea {
	// ===�����Ʒ====//
	public int ids;//���
	public String productName; // ��Ʒ����
	public double[] ll;// //��Ʒ��γ������
	public int radius; // ��Ʒ����뾶
	public int isCheck;// �Ƿ�֧����֤
	public int isRealThing; // �Ƿ�ʵ��
	public int isUp; // ���¼�
	public int isVirtual; // ����
	public int isReal; // ʵ��
	public int isChange;// �Ƿ����
	public int isTrans;//�Ƿ�ת��
	public int isRefund; // �Ƿ��˿�
	public int isSubcribe; // �Ƿ��ע���ں�
	public int isMany; // �Ƿ����볡
	public int manyConfig;// ����볡�������� [Ԥ���������|����]
	public String manyConfigVal;// ����볡����ֵ
	public int isForceBookingDate; // �Ƿ�ǿ��ִ��Ԥ������Ԥ����������
	public int userLimitProductNumber; // ��๺����
	public int productCatalog; // ��������
	public int checkVaildDateConfig; // ��Ʒ��֤����[�̶�|����]
	public String checkVaildConfigVal; // ��֤��Ч������ֵ �̶�����/����
	public String productVaildDate; // ��Ʒ��Ч�� ��ʼ����
	public int productVaildDateVal; // ��Ʒ��Ч������ֵ
	public int productArea; // ��Ʒ���� ����ʵ�﷢��
	public String productComments; // ��Ʒ����
	public  double[] productPrice;//��Ʒ���������Լ۸����� productConfig_attr
	public double[] productAreaPrice;//��Ʒ���������Լ۸����� productConfig_attr
	public String productService;// ��Ʒ����
	public String remark;//��ע
	public int supplyId;//��Ӧ��id
	public int proxyId;//������Id
	// 2��ȡƱʱ�䣺07:00~18:00
	// 3��ȡƱ�ص㣺������Ʊ����
	/*
	 * ���Ż����ߡ� ����Ʊ˵���� ���˸�˵���� ����ܰ��ʾ��
	 */
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double[] getLl() {
		return ll;
	}
	public void setLl(double[] ll) {
		this.ll = ll;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(int isCheck) {
		this.isCheck = isCheck;
	}
	public int getIsRealThing() {
		return isRealThing;
	}
	public void setIsRealThing(int isRealThing) {
		this.isRealThing = isRealThing;
	}
	public int getIsUp() {
		return isUp;
	}
	public void setIsUp(int isUp) {
		this.isUp = isUp;
	}
	public int getIsVirtual() {
		return isVirtual;
	}
	public void setIsVirtual(int isVirtual) {
		this.isVirtual = isVirtual;
	}
	public int getIsReal() {
		return isReal;
	}
	public void setIsReal(int isReal) {
		this.isReal = isReal;
	}
	public int getIsChange() {
		return isChange;
	}
	public void setIsChange(int isChange) {
		this.isChange = isChange;
	}
	public int getIsTrans() {
		return isTrans;
	}
	public void setIsTrans(int isTrans) {
		this.isTrans = isTrans;
	}
	public int getIsRefund() {
		return isRefund;
	}
	public void setIsRefund(int isRefund) {
		this.isRefund = isRefund;
	}
	public int getIsSubcribe() {
		return isSubcribe;
	}
	public void setIsSubcribe(int isSubcribe) {
		this.isSubcribe = isSubcribe;
	}
	public int getIsMany() {
		return isMany;
	}
	public void setIsMany(int isMany) {
		this.isMany = isMany;
	}
	public int getManyConfig() {
		return manyConfig;
	}
	public void setManyConfig(int manyConfig) {
		this.manyConfig = manyConfig;
	}
	public String getManyConfigVal() {
		return manyConfigVal;
	}
	public void setManyConfigVal(String manyConfigVal) {
		this.manyConfigVal = manyConfigVal;
	}
	public int getIsForceBookingDate() {
		return isForceBookingDate;
	}
	public void setIsForceBookingDate(int isForceBookingDate) {
		this.isForceBookingDate = isForceBookingDate;
	}
	public int getUserLimitProductNumber() {
		return userLimitProductNumber;
	}
	public void setUserLimitProductNumber(int userLimitProductNumber) {
		this.userLimitProductNumber = userLimitProductNumber;
	}
	public int getProductCatalog() {
		return productCatalog;
	}
	public void setProductCatalog(int productCatalog) {
		this.productCatalog = productCatalog;
	}
	public int getCheckVaildDateConfig() {
		return checkVaildDateConfig;
	}
	public void setCheckVaildDateConfig(int checkVaildDateConfig) {
		this.checkVaildDateConfig = checkVaildDateConfig;
	}
	public String getCheckVaildConfigVal() {
		return checkVaildConfigVal;
	}
	public void setCheckVaildConfigVal(String checkVaildConfigVal) {
		this.checkVaildConfigVal = checkVaildConfigVal;
	}
	public String getProductVaildDate() {
		return productVaildDate;
	}
	public void setProductVaildDate(String productVaildDate) {
		this.productVaildDate = productVaildDate;
	}
	public int getProductVaildDateVal() {
		return productVaildDateVal;
	}
	public void setProductVaildDateVal(int productVaildDateVal) {
		this.productVaildDateVal = productVaildDateVal;
	}
	public int getProductArea() {
		return productArea;
	}
	public void setProductArea(int productArea) {
		this.productArea = productArea;
	}
	public String getProductComments() {
		return productComments;
	}
	public void setProductComments(String productComments) {
		this.productComments = productComments;
	}
	public double[] getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double[] productPrice) {
		this.productPrice = productPrice;
	}
	public double[] getProductAreaPrice() {
		return productAreaPrice;
	}
	public void setProductAreaPrice(double[] productAreaPrice) {
		this.productAreaPrice = productAreaPrice;
	}
	public String getProductService() {
		return productService;
	}
	public void setProductService(String productService) {
		this.productService = productService;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
