package com.sunny.service.vo.product;

public class ProductSeckill {
//=======��ʱ ��ɱ��Ʒ============//
	// ʱ����ʾ��ʽ
	/// ��ʼʱ��
	//��ʾ��ʾ��ťʱ��
	public int ids;//���
	public int productName;// ��ɱ��Ʒ����
	public int productStartTime;// Ԥ����ʼʱ��
	public int productEndTime;// Ԥ������ʱ��
	public int productViewButtonTime;// ��ǰ��ʾ��ťʱ�� ��Ϊ��λ 0 ����ʾ ��0 ��ǰ����ʾ
	public int productSeckillPerson;// ��������
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
	public int productVaildDate; // ��Ʒ��Ч������
	public int productVaildDateVal; // ��Ʒ��Ч������ֵ
	public int productArea; // ��Ʒ���� ����ʵ�﷢��
	public int isRealThing; // �Ƿ�ʵ��
	public int isForceBookingDate; // �Ƿ�ǿ��ִ��Ԥ������Ԥ����������
	public int excededDateMethod;// �������� ����ʽ:�Զ��˿���ʽ����ϵͳ---ֻ������ǿ��ִ�в���Ч
	public int userLimitProductNumber; // ��๺����
	public int productCatalog; // ��������
	public String productComments; // ��Ʒ����
	public double[] price;// ��Ʒ�������� productConfig_attr
	public String productService;// ��Ʒ����
	public int personMax; // ��һ�û����
	public int personMaxByDay; // ÿ��ÿ�����
	public int isEntry;// �Ƿ���Ҫ����
	public String reMark;//��ע 
	public int supplyId;//��Ӧ��id
	public int proxyId;//������Id
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getProductName() {
		return productName;
	}
	public void setProductName(int productName) {
		this.productName = productName;
	}
	public int getProductStartTime() {
		return productStartTime;
	}
	public void setProductStartTime(int productStartTime) {
		this.productStartTime = productStartTime;
	}
	public int getProductEndTime() {
		return productEndTime;
	}
	public void setProductEndTime(int productEndTime) {
		this.productEndTime = productEndTime;
	}
	public int getProductViewButtonTime() {
		return productViewButtonTime;
	}
	public void setProductViewButtonTime(int productViewButtonTime) {
		this.productViewButtonTime = productViewButtonTime;
	}
	public int getProductSeckillPerson() {
		return productSeckillPerson;
	}
	public void setProductSeckillPerson(int productSeckillPerson) {
		this.productSeckillPerson = productSeckillPerson;
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
	public double[] getPrice() {
		return price;
	}
	public void setPrice(double[] price) {
		this.price = price;
	}
	public String getProductService() {
		return productService;
	}
	public void setProductService(String productService) {
		this.productService = productService;
	}
	public int getPersonMax() {
		return personMax;
	}
	public void setPersonMax(int personMax) {
		this.personMax = personMax;
	}
	public int getPersonMaxByDay() {
		return personMaxByDay;
	}
	public void setPersonMaxByDay(int personMaxByDay) {
		this.personMaxByDay = personMaxByDay;
	}
	public int getIsEntry() {
		return isEntry;
	}
	public void setIsEntry(int isEntry) {
		this.isEntry = isEntry;
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
