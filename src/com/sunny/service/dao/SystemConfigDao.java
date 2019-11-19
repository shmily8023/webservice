package com.sunny.service.dao;

public interface SystemConfigDao {
public int setOpenSystemSwitch(boolean status);//开关系统
public int setOpenBalanceSwitch(boolean status);//开关零钱
public int setGuideMpSwitch(boolean status);//是否引导关注公众号
public int setResourceAddress(int rid);//配置资源存储地址
public int setConsomerCashback(int rate);//配置抵扣比例
public int setComsumtionDeduction(int rate);//配置抵扣比例 0-100
public int setFirstGift(int num);//配置首次赠送积分
public int setSystemConfig(String s);
//网站名称
//网站描述
//网站备案号
//公司地址
//联系电话

}
