package com.sunny.service.dao;

public interface LogDao {
//日志有关接口 --相关查询？
	public int addAccidentInsurance(String s);// 意外险添加

	public int queryAccidentInsuranceList();// 查找一个用户的所有意外险

	public int queryAccidentInsuranceListDetail();// 根据一个用户查找意外险的详细信息

	public int addAccountsListLog(String s);// 对账记录添加

	public int queryAccountsListLog(String s);// 指定条件查找对账记录

	public int addBalanceLog(String s);// 零钱智币记录 添加

	public int queryBalanceLog(String s);// 零钱智币记录 条件查找

	public int queryBalanceLogAll();// 零钱智币记所有

	public int applyCashLog(String s);// 申请提现

	public int queryCashLog(String s);// 查找待提现的列表

	public int queryCashLogDetail();// 查找指定提现申请的详细信息

	public int checkCashLog(int id);// 提现审核

	public int addContract(String s);// 添加合同

	public int receiveCoupon(String s);// 优惠券领取 获取优惠券？

	public int addDealLog(String s);// 交易记录添加

	public int queryDealLogAll();// 交易记录查询所有

	public int queryDealLog(String s);// 根据指定条件查询

	public int updateDealLog(int id); // 交易记录 支付状态修改

	public int addExpressLog();// 添加快递信息

	public int queryExpressLog();// 查询所有快递记录

	public int queryExpressLog(String s);// 根据指定条件查询快递记录

	public int queryExpressStatus(String com, String num);// 查询快递当前状态 com:快递公司 num 单号

	public int addFeedbackLogSuggest();// 意见反馈-提问

	public int queryFeedbackLog();// 查询所有意见反馈列表

	public int queryFeedbackLog(String s);// 根据条件查询意见反馈列表

	public int addFeedbackLogReply();// 意见反馈-回答：根据id 查看回答

	public int queryFeedbackLogReply();// 根据id 查看回答

	public int addSearchLog();// 搜索记录

	public int getHotSearch();// 获取热门搜索

	public int addSendLog();// 发送记录 短信 模板

	public int addSysOptLog();// 系统日志添加

	public int getSysOptLog();// 根据条件查找系统日志

	public int addTokenLog();// token 日志记录

	public int getTokenLog();// 获取token信息 时间 token

	public int addUserAccessLog();// 用户访问记录

}
