package com.sunny.service.vo.product;

public class ProductGroup {
//=====�Ź���Ʒ=============//
	public int ids;//���
	public int groupStartTime; // ��ʼ����
	public int groupEndTime; // ��������
	public int groupCreateTime; // ����ʱ��
	public int groupStatus; // ��Ʒ״̬
	public int limitGroupNumber;// ��������
	public double[] price;// �۸�
	public double[] groupPrice;// // �������ܼ۸�
	public int isUp; // ���¼�
	public int isVirtual; // ����
	public int isReal; // ʵ��
	public int isChange;// �Ƿ����
	public int isRefund; // �Ƿ��˿�
	public int isSubcribe; // �Ƿ��ע���ں�
	public int isMany; // �Ƿ����볡
	public int manyConfig;// ����볡�������� [Ԥ���������|����]
	public String manyConfigVal;// ����볡����ֵ
	public int checkVaildDateConfig; // ��Ʒ��֤����[�̶�|����]
	public String checkVaildConfigVal; // ��֤��Ч������ֵ
	public int productVaildDate; // ��Ʒ��Ч��
	public int productVaildDateVal; // ��Ʒ��Ч������ֵ
	public int productArea; // ��Ʒ���� ����ʵ�﷢��
	public int isRealThing; // �Ƿ�ʵ��
	public int isForceBookingDate; // �Ƿ�ǿ��ִ��Ԥ������Ԥ����������
	public int excededDateMethod;// �������� ����ʽ:�Զ��˿���ʽ����ϵͳ---ֻ������ǿ��ִ�в���Ч
	public int userLimitProductNumber; // ��๺����
	public int productCatalog; // ��������
	public String productComments; // ��Ʒ����
	public String productService;// ��Ʒ����
	public String reMark;//��ע
	public int supplyId;//��Ӧ��id
	public int proxyId;//������Id
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getGroupStartTime() {
		return groupStartTime;
	}
	public void setGroupStartTime(int groupStartTime) {
		this.groupStartTime = groupStartTime;
	}
	public int getGroupEndTime() {
		return groupEndTime;
	}
	public void setGroupEndTime(int groupEndTime) {
		this.groupEndTime = groupEndTime;
	}
	public int getGroupCreateTime() {
		return groupCreateTime;
	}
	public void setGroupCreateTime(int groupCreateTime) {
		this.groupCreateTime = groupCreateTime;
	}
	public int getGroupStatus() {
		return groupStatus;
	}
	public void setGroupStatus(int groupStatus) {
		this.groupStatus = groupStatus;
	}
	public int getLimitGroupNumber() {
		return limitGroupNumber;
	}
	public void setLimitGroupNumber(int limitGroupNumber) {
		this.limitGroupNumber = limitGroupNumber;
	}
	public double[] getPrice() {
		return price;
	}
	public void setPrice(double[] price) {
		this.price = price;
	}
	public double[] getGroupPrice() {
		return groupPrice;
	}
	public void setGroupPrice(double[] groupPrice) {
		this.groupPrice = groupPrice;
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
	public int getProductVaildDate() {
		return productVaildDate;
	}
	public void setProductVaildDate(int productVaildDate) {
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
	public int getIsRealThing() {
		return isRealThing;
	}
	public void setIsRealThing(int isRealThing) {
		this.isRealThing = isRealThing;
	}
	public int getIsForceBookingDate() {
		return isForceBookingDate;
	}
	public void setIsForceBookingDate(int isForceBookingDate) {
		this.isForceBookingDate = isForceBookingDate;
	}
	public int getExcededDateMethod() {
		return excededDateMethod;
	}
	public void setExcededDateMethod(int excededDateMethod) {
		this.excededDateMethod = excededDateMethod;
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
	public String getProductComments() {
		return productComments;
	}
	public void setProductComments(String productComments) {
		this.productComments = productComments;
	}
	public String getProductService() {
		return productService;
	}
	public void setProductService(String productService) {
		this.productService = productService;
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
