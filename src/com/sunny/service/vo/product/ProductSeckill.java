package com.sunny.service.vo.product;

public class ProductSeckill {
//=======限时 秒杀产品============//
	// 时间显示方式
	/// 开始时间
	//提示显示按钮时间
	public int ids;//编号
	public int productName;// 秒杀产品名称
	public int productStartTime;// 预订开始时间
	public int productEndTime;// 预订结束时间
	public int productViewButtonTime;// 提前显示按钮时间 秒为单位 0 不显示 》0 提前秒显示
	public int productSeckillPerson;// 可秒人数
	public int isUp; // 上下架
	public int isVirtual; // 虚拟
	public int isReal; // 实名
	public int isChange;// 是否改期
	public int isRefund; // 是否退款
	public int isSubcribe; // 是否关注公众号
	public int isMany; // 是否多次入场
	public int manyConfig;// 多次入场配置类型 [预订后多少天|周期]
	public String manyConfigVal;// 多次入场配置值
	public int checkVaildDateConfig; // 产品验证类型[固定|周期]
	public String checkVaildConfigVal; // 验证有效期配置值
	public int productVaildDate; // 产品有效期配置
	public int productVaildDateVal; // 产品有效期配置值
	public int productArea; // 产品地区 用于实物发货
	public int isRealThing; // 是否实物
	public int isForceBookingDate; // 是否强制执行预订日期预订日期游玩
	public int excededDateMethod;// 超出日期 处理方式:自动退款还是资金归于系统---只有配置强制执行才有效
	public int userLimitProductNumber; // 最多购买几张
	public int productCatalog; // 所属分类
	public String productComments; // 产品介绍
	public double[] price;// 产品属性数组 productConfig_attr
	public String productService;// 产品服务
	public int personMax; // 单一用户最多
	public int personMaxByDay; // 每人每天次数
	public int isEntry;// 是否需要报名
	public String reMark;//备注 
	public int supplyId;//供应商id
	public int proxyId;//代理商Id
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
