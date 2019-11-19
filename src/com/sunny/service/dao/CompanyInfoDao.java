package com.sunny.service.dao;

import java.util.List;

//公司信息
public interface CompanyInfoDao {
	public int addCompanyInfo(String s); // 添加公司信息

	public int updateCompanyInfo(String s); // 修改公司信息

	public int delCompanyInfo(int id);// //删除公司信息

	public List queryCompanyInfoListAll();// 查看公司列表

	public String queryCompanyInfoDetail(int id);// 查看公司详细信息

}
