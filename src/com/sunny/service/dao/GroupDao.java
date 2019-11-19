package com.sunny.service.dao;

import java.util.List;

//团队申请 审核 接口
public interface GroupDao {

	public int applyGroup(String s);// 团队申请

	public List queryGroup_User(String userId);// 团队查询-用户

	public List queryGroup_Supply(String supplyId);// 团队查询-供应商

	public int checkGroupTicket(String userId);// 票务审核[检票 财务 经理]

	public int importFinance();// 资金入账

	public String queryGroup_Print(int id);/// 获取单一团队信息 --打印
}
