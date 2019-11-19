package com.sunny.service.dao;

public interface ProductDao {
	public int setProductSwitch(int productId, int productType, int productSwitch);// 设置产品上下架状态

	public String getProductSwitch(int productId, int productType);// 获取产品上下架状态

	public int purchaseProduct_Costomer(String s);// 消费者购买

	public int purchaseProduct_Supply(String s);// 供应商购买

	public int purchaseProductLs_Customer(String s);// 消费者零食购买
	public int addProductLs(String s);// 零食产品添加
	public int addProductStandTicket(String s);// 普通门票产品添加

	public int addProductBargain(String s);// 砍价产品添加

	public int addProductIntegral(String s);// 积分产品添加

	public int addProductGroup(String s);// 拼团产品添加

	public int addProductLimit(String s);// 限时产品添加

	public int addProductPft(String s);// 票付通产品添加

	public int addProductUnion(String s);// 联合产品添加

	public int addProductArea(String s);// 区域产品添加
	public int modifyProductLs(int ids,String productName,String productPrice);// 零食产品修改
	public int modifyProductStandTicket(String s);// 普通门票产品修改

	public int modifyProductBargain(String s);// 砍价产品修改

	public int modifyProductIntegral(String s);// 积分产品修改

	public int modifyProductGroup(String s);// 拼团产品修改

	public int modifyProductLimit(String s);// 限时产品修改

	public int modifyProductPft(String s);// 票付通产品修改

	public int modifyProductUnion(String s);// 联合产品修改

	public int modifyProductArea(String s);// 区域产品修改
	public int delProductLs(int id);// 零食产品删除
	public int delProductStandTicket(int id);// 普通门票产品删除

	public int delProductBargain(int id);// 砍价产品删除

	public int delProductIntegral(int id);// 积分产品删除

	public int delProductGroup(int id);// 拼团产品删除

	public int delProductLimit(int id);// 限时产品删除

	public int delProductPft(int id);// 票付通产品删除

	public int delProductUnion(int id);// 联合产品删除

	public int delProductArea(int id);// 区域产品删除

	public int queryProduct();// 产品查询所有
	public int queryProductLs(String s);// 根据指定条件查询产品零食 返回价格 单位
	public int queryProduct(String s);// 根据指定条件查询产品

	public int queryProductAttr(int productId);// 查询产品下所有属性

	public int queryProductCatalog(int productId);// 根据产品 查询分类

	public int queryProductByCatalog(int catalogId);// 查询分类下的产品

	public int addProductCatalog(String s);// 添加产品分类

	public int addProductAttr(String s);// 添加产品属性

	public int delProductCatalog(int id);// 删除产品分类

	public int delProductAttr(int id);// 删除产品属性

	public int modifyProductCatalog(String s);// 修改产品分类

	public int modifyProductAttr(String s);// 修改产品属性

	public int addProductStock(String s);// 产品库存增加

	public int addProductComments(String s);// 产品评论

	public int setProductCommentsHidden(boolean hidden);// 设置评论隐藏

	public int addProduct_SimpleProduct(String s);// 单项目新增

	public int modifyProduct_SimpleProduct(String s);// 单项目修改 基本信息 验票人员数组

	public int delProduct_SimpleProduct(int id);// 单项目删除
	
}
