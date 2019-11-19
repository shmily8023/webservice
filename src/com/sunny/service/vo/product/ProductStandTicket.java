package com.sunny.service.vo.product;

public class ProductStandTicket {
//=========普通门票产品=============//
	public int ids;//编号
	public String productName;//产品名称
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
	public String[] attr;// 产品属性数组 productConfig_attr
	public String productService;// 产品服务
	public String reMark;//备注
	public int supplyId;//供应商id
	public int proxyId;//代理商Id
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
	public String[] getAttr() {
		return attr;
	}
	public void setAttr(String[] attr) {
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

	// 2、取票时间：07:00~18:00
	// 3、取票地点：景区售票窗口
	/*
	 * 
	 * 【优惠政策】 【发票说明】 【退改说明】 【温馨提示】
	 */
	public void paseProduct_StandTicket() {
		//处理相关变量关联问题 传输的json未配置 导致的异常?
		if(isReal==1) {
			//必须实名 则 最多购买1张
			userLimitProductNumber=1;
		}
		else {
			//设置为
			//pu.setIsReal(0);//不实名
			userLimitProductNumber=1;//不限制数量
		}
		if(isForceBookingDate==1) {
			//强制执行 获取配置值并设置
			userLimitProductNumber=1;
		}
		else {
			//设置为

		}
	}
}
