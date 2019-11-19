package com.sunny.service.vo.product;

public class ProductConfig_Attr {
//产品属性 分类下属性--匹配分类 表格自动增行 删行
	public int ids;// 编号
	public int catalogId;// 分类编号
	public int attrId;// 属性编号
	public int attrName;// 属性名字
	public int attrType;// 卡类型 身高|年龄
	public int height;// 身高 cm 单位
	public int age;// 年龄 age 单位
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}
	public int getAttrId() {
		return attrId;
	}
	public void setAttrId(int attrId) {
		this.attrId = attrId;
	}
	public int getAttrName() {
		return attrName;
	}
	public void setAttrName(int attrName) {
		this.attrName = attrName;
	}
	public int getAttrType() {
		return attrType;
	}
	public void setAttrType(int attrType) {
		this.attrType = attrType;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
