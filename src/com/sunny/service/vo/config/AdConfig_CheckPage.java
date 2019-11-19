package com.sunny.service.vo.config;

public class AdConfig_CheckPage {
//产品验证页
	public int ids;//编号
	public int productId;//产品
	public int viewAdType;//展现广告类型[纯html|轮播]
	public int calcType;//计算类型 CPC |CPM
	public String adContent;	//广告内容
	public String[] urlTips;//悬浮图片提示
	public String[] imgUrl;	//轮播图片url 加载url显示 |点击 url加载

}
