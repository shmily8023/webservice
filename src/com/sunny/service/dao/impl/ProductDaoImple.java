package com.sunny.service.dao.impl;

import java.sql.ResultSet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.sunny.service.dao.ProductDao;
import com.sunny.service.util.DbHelper;
import com.sunny.service.vo.product.ProductLs;
import com.sunny.service.vo.product.ProductStandTicket;
import com.sunny.service.vo.product.ProductUnion;

public class ProductDaoImple implements ProductDao {
	DbHelper d;

	@Override
	public int setProductSwitch(int productId, int productType, int productSwitch) {
		// TODO Auto-generated method stub
		int query_product_ids = 0;
		int default_isUp = -1;// 默认为-1 数据库： 0 1
		int get_isUp;// rs.getInt id
		try {
			d = new DbHelper();
			switch (productType) {
			case 0:// product_area
				String myStr = getProductSwitch(productId, productType);
				JSONObject obj = JSON.parseObject(myStr);
				int coden = obj.getInteger("code");
				System.out.println(obj.toJSONString());
				//System.out.println("code:::" + coden);
				if (coden == 0) {
					JSONObject obj2 = JSON.parseObject(myStr).getJSONObject("result");
					query_product_ids=obj2.getInteger("ids");
					get_isUp = obj2.getInteger("isUp");
				//	System.out.println("isUp:::" + get_isUp);

					if (default_isUp == get_isUp) {
						// 开关变量值一致 不做处理
					} else {
						if (get_isUp == 0) {
							// 设置为1
							int exeUpdateStatus = d
									.executeUpdate("update product_area set isUp=1 where ids=" + query_product_ids);// 返回影响到行数
							if (exeUpdateStatus == 1) {
								System.out.print("更新1成功");
							} else {
								System.out.print("更新1失败");
							}
						} else if (get_isUp == 1) {
							// 设置为0
							int exeUpdateStatus = d
									.executeUpdate("update product_area set isUp=0 where ids=" + query_product_ids);// 返回影响到行数
							if (exeUpdateStatus == 1) {
								System.out.print("更新2成功");
							} else {
								System.out.print("更新2失败");
							}
						}

						else {

						}
					}

				} else {
					System.out.print("else！！！");
				}

				// 首先查询 产品列表数据库
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public String getProductSwitch(int productId, int productType) {
		// TODO Auto-generated method stub
		int query_product_ids;
		int default_isUp = -1;// 默认为-1 数据库： 0 1
		int get_isUp;// rs.getInt id
		String returnStr = "";
		try {
			d = new DbHelper();
			switch (productType) {
			case 0:// product_area
				ResultSet rs = d.executeQuery("select * from product_area_view where productType=" + productType
						+ " and product_ids=" + productId + " limit 1");
				while (rs.next()) {
					query_product_ids = rs.getInt("ids");//// 该产品的id
					get_isUp = rs.getInt("isUp");
					returnStr = "{\"code\":0,\"msg\":\"ok\",\"result\":{\"ids\":" + query_product_ids + ",\"isUp\":"
							+ get_isUp + "}}";
					return returnStr;
				}

				// 首先查询 产品列表数据库
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			returnStr = "{\"code\":-1,\"msg\":\"system eror\",\"exception\":" + "\"" + e.getMessage() + "\"}";
			e.printStackTrace();
		}

		return returnStr;
	}

	@Override
	public int purchaseProduct_Costomer(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int purchaseProduct_Supply(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int purchaseProductLs_Customer(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductLs(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductStandTicket(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductBargain(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductIntegral(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductGroup(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductLimit(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductPft(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductUnion(String s) {

		try {
			d = new DbHelper();
			Gson gson = new Gson();

			ProductUnion pu = gson.fromJson(s, ProductUnion.class);
			pu.paseProduct_Union();
			// checkBeanVal();检查beanval值
			// 测试 json无字段 obj但是设置 插入数据库什么样？//解决插入不上数据
			Object[] obj = new Object[] { pu.productName, // 前端校验:产品名
					pu.productId1, // 前端校验:产品Id1
					pu.productId2, // 前端校验:产品Id2
					pu.productAttr1, // 前端校验:产品属性名
					pu.productAttr2, // 前端校验:产品属性名2
					pu.isUp, // 后期设置为1 自动上架
					pu.isVirtual, // 联合票中 本字段为1 虚拟而非实物
					pu.isReal, // 联合票中 本字段为0 虚拟而非实物
					pu.isChange, // 本字段 默认为0 可改期
					pu.isRefund, // 本字段 默认为0 可退款
					pu.isSubcribe, // 本字段 默认为0 无需关注公众号
					pu.isMany, pu.manyConfig, //
					pu.manyConfigVal, pu.checkVaildDateConfig, //
					pu.checkVaildConfigVal, pu.productArea, //
					pu.isForceBookingDate, pu.excededDateMethod, //
					pu.userLimitProductNumber, pu.productCatalog, //
					pu.productComments, pu.attr, pu.productService, //
					pu.reMark, pu.supplyId, // 前端追加的数据
					pu.proxyId,// 前端追加的数据

			};
			String sql2 = "Insert Into wxuser(city,country,headimgurl) Values (?,?,?)";
			String sql3 = "INSERT INTO product_union(productName, productId1, productId2, productAttr1, productAttr2, isUp, isVirtual, isReal, isChange, isRefund, isSubcribe, isMany, manyConfig, manyConfigVal, checkVaildDateConfig, checkVaildConfigVal, productArea, isForceBookingDate, excededDateMethod, userLimitProductNumber, productCatalog, productComments, attr, productService, reMark, supplyId, proxyId) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			System.out.print(sql3);

			d.executeUpdate(sql3, obj);

			System.out.print(pu.getProductName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// WxUser wuser = JSON.parseObject(JsonData.wxUserBaseData,WxUser.class);
		// Object[] obj = new Object[]{wuser.city,wuser.country,wuser.headimgurl};
		// String sql2="Insert Into wxuser(city,country,headimgurl) Values (?,?,?)";
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductArea(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductLs(int ids,String productName,String productPrice) {

		try {
			d = new DbHelper();

			Object[] obj = new Object[] {productName, // 前端校验:产品名
					productPrice, // 前端校验:产品Id1
					ids, // 前端校验:产品Id2
			};
			//UPDATE product_ls SET productName = ?,productPrice=? WHERE ids = ?
			String sql3 = "update product_ls SET productName = ?,productPrice=? where ids = ? ";
			System.out.print(sql3);

			d.executeUpdate(sql3, obj);

			//System.out.print(pu.getProductName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int modifyProductStandTicket(String s) {
		//产品名一经添加不可修改
		try {
			d = new DbHelper();
			Gson gson = new Gson();

			ProductStandTicket pu = gson.fromJson(s, ProductStandTicket.class);
			pu.paseProduct_StandTicket();
			//pu.paseProduct_Union();
			// checkBeanVal();检查beanval值
			// 测试 json无字段 obj但是设置 插入数据库什么样？//解决插入不上数据
			Object[] obj = new Object[] { pu.productName, // 前端校验:产品名
					pu.isUp, // 后期设置为1 自动上架
					pu.isVirtual, // 联合票中 本字段为1 虚拟而非实物
					pu.isReal, // 联合票中 本字段为0 虚拟而非实物
					pu.isChange, // 本字段 默认为0 可改期
					pu.isRefund, // 本字段 默认为0 可退款
					pu.isSubcribe, // 本字段 默认为0 无需关注公众号
					pu.isMany,
					pu.manyConfig, //
					pu.manyConfigVal,
					pu.checkVaildDateConfig, //
					pu.checkVaildConfigVal,
					pu.productVaildDate,
					pu.productVaildDateVal,
					pu.isRealThing,
					pu.productArea, //
					pu.isForceBookingDate, 
					pu.excededDateMethod, //
					pu.userLimitProductNumber, 
					pu.productCatalog, //
					pu.productComments,
					pu.attr, 
					pu.productService, //

			};
			String sql3 = "UPDATE  `product_standticket` SET `isUp` = ?, `isVirtual` = ?, `isReal` = ?, `isChange` = ?, `isRefund` = ?, `isSubcribe` = ?, `isMany` = ?, `manyConfig` = ?, `manyConfigVal` = ?, `checkVaildDateConfig` = ?, `checkVaildConfigVal` = ?, `productVaildDate` = ?, `productVaildDateVal` = ?, `productArea` = ?, `isRealThing` = ?, `isForceBookingDate` = ?, `excededDateMethod` = ?, `userLimitProductNumber` = ?, `productCatalog` = ?, `productComments` = ?, `attr` = ?, `productService` = ?  WHERE `ids` = 1;";
			System.out.print(sql3);

			d.executeUpdate(sql3, obj);

			System.out.print(pu.getProductName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// WxUser wuser = JSON.parseObject(JsonData.wxUserBaseData,WxUser.class);
		// Object[] obj = new Object[]{wuser.city,wuser.country,wuser.headimgurl};
		// String sql2="Insert Into wxuser(city,country,headimgurl) Values (?,?,?)";
		// TODO Auto-generated method stub
		return 0;
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductBargain(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductIntegral(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductGroup(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductLimit(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductPft(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductUnion(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductArea(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductLs(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductStandTicket(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductBargain(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductIntegral(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductGroup(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductLimit(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductPft(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductUnion(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductArea(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int queryProduct() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int queryProductLs(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int queryProduct(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int queryProductAttr(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int queryProductCatalog(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int queryProductByCatalog(int catalogId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductCatalog(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductAttr(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductCatalog(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProductAttr(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductCatalog(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProductAttr(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductStock(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProductComments(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setProductCommentsHidden(boolean hidden) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProduct_SimpleProduct(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyProduct_SimpleProduct(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delProduct_SimpleProduct(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void checkBeanVal() {
		// 检查beanval值 默认处理
	}
}
