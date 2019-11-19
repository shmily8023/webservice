package com.sunny.service.vo.product;

public class ProductConfig_AttrPrice {
//属性价格
	public int ids;//编号
	public int attrId;//属性编号ProductConfig_Attr[id]
	public double price;//价格
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getAttrId() {
		return attrId;
	}
	public void setAttrId(int attrId) {
		this.attrId = attrId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
