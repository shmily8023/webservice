package com.sunny.service.service.impl;

import com.sunny.service.dao.ProductDao;
import com.sunny.service.dao.impl.ProductDaoImple;
import com.sunny.service.dao.impl.UserDaoImpl;
import com.sunny.service.service.ProductService;
import com.sunny.service.service.UserServices;

public class MyUserService implements UserServices,ProductService{
	private ProductDao dao = new ProductDaoImple();
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
	}
	/*
	private WxUserDao dao = new UserDaoImpl();
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.print("执行 MyUserService");
		dao.addWxUser();
	}
*/

	@Override
	public int addProductUnion() {
		// TODO Auto-generated method stub
		ProductDaoImple pdi=new ProductDaoImple();
		pdi.modifyProductLs(1, "222", "333");
		//pdi.setProductSwitch(123456, 0, 0);
		//pdi.checkBeanVal();
		//String testJson="{\"productName\":\"鳳凰\",\"productId1\":\"1\",\"productId2\":\"1\",\"productAttr1\":\"1\",\"productAttr2\":\"1\",\"isUp\":\"1\",\"isVirtual\":\"1\",\"isReal\":\"1\",\"isChange\":\"1\",\"isRefund\":\"1\",\"isSubcribe\":\"1\",\"isMany\":\"1\",\"manyConfig\":\"1\",\"manyConfigVal\":\"value\",\"checkVaildDateConfig\":1,\"checkVaildConfigVal\":\"value\",\"productArea\":1,\"isForceBookingDate\":2,\"excededDateMethod\":3,\"userLimitProductNumber\":4,\"productCatalog\":7,\"productComments\":\"value\",\"attr\":\"value\",\"productService\":\"value\",\"reMark\":\"value\",\"supplyId\":1,\"proxyId\":2}";
		//接受json 处理空值问题
		//pdi.addProductUnion(testJson);
		return 0;
	}
	public static void main(String[] args) {
		MyUserService mu=new MyUserService();
		mu.addProductUnion();
	}
}
