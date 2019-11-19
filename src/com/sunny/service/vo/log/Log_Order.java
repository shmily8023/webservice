package com.sunny.service.vo.log;

public class Log_Order {
	public int ids;//编号
	public int orderId;// 订单号  
	public long createTime;// 下单时间
	public long orderVaidDate;// 订单有效期
	public long verifyVaildDate;// 验证有效期
	public int productId;// 产品信息id
	public int productAttrId;// 产品属性Id
	public int buyType;// 购买方式 ：h5 微信 app miniapp pc
	public int buyType3;// 电子 现金
	public int buyApi;// 购买接口信息
	public int payStatus;//支付状态:未支付 已支付
	public int status;// 订单状态 全部核销，未核销，已发货，已收货，运送中，配货中 团购不生效 团购生效
	public int isreal;// 是否实物 订单与快递表修改 用户一个订单发多个快递单号状态
	public int orderAddresss;// 下单地址 ---整合？
	public int orderUserId;// 下单用户 整合？
	public int userAddress;// 下单用户所在地址
	public int subOrderType;// 下单方式 后台消费下单
								// 后台供应商下单[查询用户[openid]|身份证查询[绑定才可以]-自动下单无需交互]，微信前台消费下单,小程序下单，H5下单，app下单
	public int comment;// 下单备注
	public double expressPrice;// 额外支付的快递费
	public double orderAmount;// 下单金额
	public int orderNum;// 下单数量
	public double yhq;// 优惠券减免金额
	public double zb;// 智币减免金额
	public int yhqid;// 优惠券id
	public int zbid;// 智币减免计算方式 智币与金额兑换比例 
	public double paySxf;// 支付手续费
	public double ewx;// 意外险费用
	public double otherFee;//其他减免 团购？
	public int orderFlag;//订单标记 免单|折扣？
	public String reMark;//备注
	public String realName;//姓名
    public String realCardId;//手机号 下单手机号
    public String realPhoneNumber;//身份证号
    public int isAccidentInsurance;//是否投保保险
    public int isAccidentInsuranceCompany;//投保的保险公司
    public int isAccidentInsuranceNumber;//投保的保险单号
    //
    public int groupId;	//团购序号
 //查团购序号表 成团人数 达到：在订单表根据团购序号 设置状态 团购生效。  不达到 根据团购序号查有关订单 根据订单执行退款
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public long getOrderVaidDate() {
		return orderVaidDate;
	}
	public void setOrderVaidDate(long orderVaidDate) {
		this.orderVaidDate = orderVaidDate;
	}
	public long getVerifyVaildDate() {
		return verifyVaildDate;
	}
	public void setVerifyVaildDate(long verifyVaildDate) {
		this.verifyVaildDate = verifyVaildDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductAttrId() {
		return productAttrId;
	}
	public void setProductAttrId(int productAttrId) {
		this.productAttrId = productAttrId;
	}
	public int getBuyType() {
		return buyType;
	}
	public void setBuyType(int buyType) {
		this.buyType = buyType;
	}
	public int getBuyApi() {
		return buyApi;
	}
	public void setBuyApi(int buyApi) {
		this.buyApi = buyApi;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getIsreal() {
		return isreal;
	}
	public void setIsreal(int isreal) {
		this.isreal = isreal;
	}
	public int getOrderAddresss() {
		return orderAddresss;
	}
	public void setOrderAddresss(int orderAddresss) {
		this.orderAddresss = orderAddresss;
	}
	public int getOrderUserId() {
		return orderUserId;
	}
	public void setOrderUserId(int orderUserId) {
		this.orderUserId = orderUserId;
	}
	public int getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(int userAddress) {
		this.userAddress = userAddress;
	}
	public int getSubOrderType() {
		return subOrderType;
	}
	public void setSubOrderType(int subOrderType) {
		this.subOrderType = subOrderType;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public double getExpressPrice() {
		return expressPrice;
	}
	public void setExpressPrice(double expressPrice) {
		this.expressPrice = expressPrice;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public double getYhq() {
		return yhq;
	}
	public void setYhq(double yhq) {
		this.yhq = yhq;
	}
	public double getZb() {
		return zb;
	}
	public void setZb(double zb) {
		this.zb = zb;
	}
	public int getYhqid() {
		return yhqid;
	}
	public void setYhqid(int yhqid) {
		this.yhqid = yhqid;
	}
	public int getZbid() {
		return zbid;
	}
	public void setZbid(int zbid) {
		this.zbid = zbid;
	}
	public double getPaySxf() {
		return paySxf;
	}
	public void setPaySxf(double paySxf) {
		this.paySxf = paySxf;
	}
	public double getEwx() {
		return ewx;
	}
	public void setEwx(double ewx) {
		this.ewx = ewx;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRealCardId() {
		return realCardId;
	}
	public void setRealCardId(String realCardId) {
		this.realCardId = realCardId;
	}
	public String getRealPhoneNumber() {
		return realPhoneNumber;
	}
	public void setRealPhoneNumber(String realPhoneNumber) {
		this.realPhoneNumber = realPhoneNumber;
	}
	public int getIsAccidentInsurance() {
		return isAccidentInsurance;
	}
	public void setIsAccidentInsurance(int isAccidentInsurance) {
		this.isAccidentInsurance = isAccidentInsurance;
	}
	public int getIsAccidentInsuranceCompany() {
		return isAccidentInsuranceCompany;
	}
	public void setIsAccidentInsuranceCompany(int isAccidentInsuranceCompany) {
		this.isAccidentInsuranceCompany = isAccidentInsuranceCompany;
	}
	public int getIsAccidentInsuranceNumber() {
		return isAccidentInsuranceNumber;
	}
	public void setIsAccidentInsuranceNumber(int isAccidentInsuranceNumber) {
		this.isAccidentInsuranceNumber = isAccidentInsuranceNumber;
	}
	
}
