package com.sunny.service.vo.product;

public class ProductUnion {
//����Ʊ
	// ����Ʊ �ȴӻ�����Ʒ���в�ѯ��Ʒ������������Ʊ��ѯ��¼.�ж����ڲ�Ʒid1���ǲ�Ʒid2.����֤��¼ ������¼ ��ѯ �������
	public int ids;//���
	public String productName; // ��Ʒ��
	public int productId1; // ��Ʒid1
	public int productId2; // ��Ʒid2
	public int productAttr1; // ��Ʒ����1
	public int productAttr2;// //��Ʒ����2
	// ��Ʒ��Ӷ���� ÿһλ��Ӳ��ô���10
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
	public int productArea; // ��Ʒ����
	public int isForceBookingDate; // �Ƿ�ǿ��ִ��Ԥ������Ԥ����������
	public int excededDateMethod;// �������� ����ʽ:�Զ��˿���ʽ����ϵͳ---ֻ������ǿ��ִ�в���Ч
	public int userLimitProductNumber; // ��๺����
	public int productCatalog; // ��������
	public String productComments; // ��Ʒ����
	public String attr;// ��Ʒ�������� productConfig_attr //,�ָ� ���� ȡ������
	public String productService;// ��Ʒ����
	public String reMark;// ��ע
	public int supplyId;// ��Ӧ��id
	public int proxyId;// ������Id

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

	public int getProductId1() {
		return productId1;
	}

	public void setProductId1(int productId1) {
		this.productId1 = productId1;
	}

	public int getProductId2() {
		return productId2;
	}

	public void setProductId2(int productId2) {
		this.productId2 = productId2;
	}

	public int getProductAttr1() {
		return productAttr1;
	}

	public void setProductAttr1(int productAttr1) {
		this.productAttr1 = productAttr1;
	}

	public int getProductAttr2() {
		return productAttr2;
	}

	public void setProductAttr2(int productAttr2) {
		this.productAttr2 = productAttr2;
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

	public int getProductArea() {
		return productArea;
	}

	public void setProductArea(int productArea) {
		this.productArea = productArea;
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



	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
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
public void paseProduct_Union() {
	//������ر����������� �����jsonδ���� ���µ��쳣?
	if(isReal==1) {
		//����ʵ�� �� ��๺��1��
		userLimitProductNumber=1;
	}
	else {
		//����Ϊ
		//pu.setIsReal(0);//��ʵ��
		userLimitProductNumber=1;//����������
	}
	if(isForceBookingDate==1) {
		//ǿ��ִ�� ��ȡ����ֵ������
		userLimitProductNumber=1;
	}
	else {
		//����Ϊ

	}
}
}
