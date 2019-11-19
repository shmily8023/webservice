package com.sunny.service.vo.product;

public class ProductStock {
	
//==========产品库存管理================//
	public int ids;//编号
	public int productId;//产品编号
	public int productType;//产品类型 积分 区域 等等
    public int productAttrId;//产品属性编号
    public int productStockAddTime;//库存增加时间
    public int productStockAddVal;//库存增加值
    public int productStockAddPerson;//操作人
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public int getProductAttrId() {
		return productAttrId;
	}
	public void setProductAttrId(int productAttrId) {
		this.productAttrId = productAttrId;
	}
	public int getProductStockAddTime() {
		return productStockAddTime;
	}
	public void setProductStockAddTime(int productStockAddTime) {
		this.productStockAddTime = productStockAddTime;
	}
	public int getProductStockAddVal() {
		return productStockAddVal;
	}
	public void setProductStockAddVal(int productStockAddVal) {
		this.productStockAddVal = productStockAddVal;
	}
	public int getProductStockAddPerson() {
		return productStockAddPerson;
	}
	public void setProductStockAddPerson(int productStockAddPerson) {
		this.productStockAddPerson = productStockAddPerson;
	}

    
}
