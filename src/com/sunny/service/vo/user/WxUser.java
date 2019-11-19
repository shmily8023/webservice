package com.sunny.service.vo.user;

public class WxUser {
public int ids;//serial id
	public  int subscribe;// subscribe 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
	public  String openid; // openid 用户的标识，对当前公众号唯一
	public  String nickname; // NickName 用户的昵称
	public  int sex; // Sex 用户的性别
	public  String language; // Language 用户的语言，简体中文为zh_CN
	public  String city; // City 用户所在城市
	public  String province; //province 用户所在省份
	public  String country; //  country 用户所在国家
	public  String headimgurl; // HeadImgUrl 用户头像地址
	public  String subscribe_time; // SubScribe_Time 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
	public  String unionid;// UnionId 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
	public  String remark;// Remark 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
	public  int groupId;// GroupId 用户所在的分组ID（兼容旧的用户分组接口）
	public  String tagId_list;// TagId_list 用户被打上的标签ID列表
	public  String subscribe_scene;// Subscribe_Scene 返回用户关注的渠道来源，ADD_SCENE_SEARCH 公众号搜索，ADD_SCENE_ACCOUNT_MIGRATION 公众号迁移，ADD_SCENE_PROFILE_CARD  名片分享，ADD_SCENE_QR_CODE 扫描二维码，ADD_SCENE_PROFILE_ LINK  图文页内名称点击，ADD_SCENE_PROFILE_ITEM 图文页右上角菜单，ADD_SCENE_PAID 支付后关注，ADD_SCENE_OTHERS 其他
	public  String qr_scene;// Qr_Scene二维码扫码场景（开发者自定义）
	public  String qr_scene_str;// Qr_Scene_str 二维码扫码场景描述（开发者自定义）
	public  int isDistribute;// IsDistribute 是否分销用户
	public  int isBlockList;// IsBlockList 是否黑名单
	public  int proxyId;//代理商编号
	public  String payPassword;//加密后的支付密码
	public  int currentSignDay;// 当前签到天数
	public  int isCurrentSign;// 是否连续签到
	public String bindApiId;//绑定的apiId
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public int getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(int subscribe) {
		this.subscribe = subscribe;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getSubscribe_time() {
		return subscribe_time;
	}
	public void setSubscribe_time(String subscribe_time) {
		this.subscribe_time = subscribe_time;
	}
	public String getUnionid() {
		return unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getTagId_list() {
		return tagId_list;
	}
	public void setTagId_list(String tagId_list) {
		this.tagId_list = tagId_list;
	}
	public String getSubscribe_scene() {
		return subscribe_scene;
	}
	public void setSubscribe_scene(String subscribe_scene) {
		this.subscribe_scene = subscribe_scene;
	}
	public String getQr_scene() {
		return qr_scene;
	}
	public void setQr_scene(String qr_scene) {
		this.qr_scene = qr_scene;
	}
	public String getQr_scene_str() {
		return qr_scene_str;
	}
	public void setQr_scene_str(String qr_scene_str) {
		this.qr_scene_str = qr_scene_str;
	}
	public int getIsDistribute() {
		return isDistribute;
	}
	public void setIsDistribute(int isDistribute) {
		this.isDistribute = isDistribute;
	}
	public int getIsBlockList() {
		return isBlockList;
	}
	public void setIsBlockList(int isBlockList) {
		this.isBlockList = isBlockList;
	}

	public int getProxyId() {
		return proxyId;
	}
	public void setProxyId(int proxyId) {
		this.proxyId = proxyId;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public int getCurrentSignDay() {
		return currentSignDay;
	}
	public void setCurrentSignDay(int currentSignDay) {
		this.currentSignDay = currentSignDay;
	}
	public int getIsCurrentSign() {
		return isCurrentSign;
	}
	public void setIsCurrentSign(int isCurrentSign) {
		this.isCurrentSign = isCurrentSign;
	}
	public String getBindApiId() {
		return bindApiId;
	}
	public void setBindApiId(String bindApiId) {
		this.bindApiId = bindApiId;
	}

}
