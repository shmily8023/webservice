package com.sunny.service.vo.user;

public class WxUser {
public int ids;//serial id
	public  int subscribe;// subscribe �û��Ƿ��ĸù��ںű�ʶ��ֵΪ0ʱ��������û�û�й�ע�ù��ںţ���ȡ����������Ϣ��
	public  String openid; // openid �û��ı�ʶ���Ե�ǰ���ں�Ψһ
	public  String nickname; // NickName �û����ǳ�
	public  int sex; // Sex �û����Ա�
	public  String language; // Language �û������ԣ���������Ϊzh_CN
	public  String city; // City �û����ڳ���
	public  String province; //province �û�����ʡ��
	public  String country; //  country �û����ڹ���
	public  String headimgurl; // HeadImgUrl �û�ͷ���ַ
	public  String subscribe_time; // SubScribe_Time �û���עʱ�䣬Ϊʱ���������û�����ι�ע����ȡ����עʱ��
	public  String unionid;// UnionId ֻ�����û������ںŰ󶨵�΢�ſ���ƽ̨�ʺź󣬲Ż���ָ��ֶ�
	public  String remark;// Remark ���ں���Ӫ�߶Է�˿�ı�ע�����ں���Ӫ�߿���΢�Ź���ƽ̨�û��������Է�˿��ӱ�ע
	public  int groupId;// GroupId �û����ڵķ���ID�����ݾɵ��û�����ӿڣ�
	public  String tagId_list;// TagId_list �û������ϵı�ǩID�б�
	public  String subscribe_scene;// Subscribe_Scene �����û���ע��������Դ��ADD_SCENE_SEARCH ���ں�������ADD_SCENE_ACCOUNT_MIGRATION ���ں�Ǩ�ƣ�ADD_SCENE_PROFILE_CARD  ��Ƭ����ADD_SCENE_QR_CODE ɨ���ά�룬ADD_SCENE_PROFILE_ LINK  ͼ��ҳ�����Ƶ����ADD_SCENE_PROFILE_ITEM ͼ��ҳ���Ͻǲ˵���ADD_SCENE_PAID ֧�����ע��ADD_SCENE_OTHERS ����
	public  String qr_scene;// Qr_Scene��ά��ɨ�볡�����������Զ��壩
	public  String qr_scene_str;// Qr_Scene_str ��ά��ɨ�볡���������������Զ��壩
	public  int isDistribute;// IsDistribute �Ƿ�����û�
	public  int isBlockList;// IsBlockList �Ƿ������
	public  int proxyId;//�����̱��
	public  String payPassword;//���ܺ��֧������
	public  int currentSignDay;// ��ǰǩ������
	public  int isCurrentSign;// �Ƿ�����ǩ��
	public String bindApiId;//�󶨵�apiId
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
