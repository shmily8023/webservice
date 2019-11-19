package com.sunny.service.vo.product;

public class ProductArea {
	// ===区域产品====//
	public int ids;//编号
	public String productName; // 产品名称
	public double[] ll;// //产品经纬度数组
	public int radius; // 产品辐射半径
	public int isCheck;// 是否支持验证
	public int isRealThing; // 是否实物
	public int isUp; // 上下架
	public int isVirtual; // 虚拟
	public int isReal; // 实名
	public int isChange;// 是否改期
	public int isTrans;//是否转增
	public int isRefund; // 是否退款
	public int isSubcribe; // 是否关注公众号
	public int isMany; // 是否多次入场
	public int manyConfig;// 多次入场配置类型 [预订后多少天|周期]
	public String manyConfigVal;// 多次入场配置值
	public int isForceBookingDate; // 是否强制执行预订日期预订日期游玩
	public int userLimitProductNumber; // 最多购买几张
	public int productCatalog; // 所属分类
	public int checkVaildDateConfig; // 产品验证类型[固定|周期]
	public String checkVaildConfigVal; // 验证有效期配置值 固定天数/期限
	public String productVaildDate; // 产品有效期 起始截至
	public int productVaildDateVal; // 产品有效期配置值
	public int productArea; // 产品地区 用于实物发货
	public String productComments; // 产品介绍
	public  double[] productPrice;//产品区域内属性价格数组 productConfig_attr
	public double[] productAreaPrice;//产品区域外属性价格数组 productConfig_attr
	public String productService;// 产品服务
	public String remark;//备注
	public int supplyId;//供应商id
	public int proxyId;//代理商Id
	// 2、取票时间：07:00~18:00
	// 3、取票地点：景区售票窗口
	/*
	 * 【优惠政策】 【发票说明】 【退改说明】 【温馨提示】
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
