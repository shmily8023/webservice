package com.sunny.service.dao;

//微信接口 配置接口
public interface WxDao {
	public int addWxConfig(); // 添加

	public int modifyWxConfig(); // 修改

	public int delWxConfig(); // 删除

	public int testWxConfig();// 测试微信接口是否有效

	public int getUserTag();// 获取用户标签

	public int getUserGroup();// 获取用户分组

	public int setUserTag();// 设置用户标签

	public int setUserGroup();// 设置用户分组

	public int getUserList();// 获取用户列表

	public int getUserDetail();// 获取用户详情

	public int sendSubscribeMessage();// 发送关注信息

	public int sendNoSubscribeMessage();// 发送未包含信息

	public int sendKeyWordMessage();// 发送关键词信息

	public int uploadPic();//上传图片

	public int uploadVideo();//上传视频

	public int uploadAudio();//上传音频

	public int sendGroupTextMessage();//群发文本信息

	public int sendGroupPicMessage();//群发图片信息

	public int sendGroupVideoMessage();//群发视频信息

	public int sendGroupAudioMessage();//群发音频信息

	public int createMenu();//创建菜单

	public int getMenu();//获取菜单

	public int delMenu();//删除菜单

	public int setUserRemark();// 设置用户备注

	public int getBlockUserList();// 获取黑名单列表

	public int setBlockUser();// 拉黑用户

	public int transToShortUrl();//长连接转短链接

	public int getUserSummary();// 获取用户增减数据 7
								// https://api.weixin.qq.com/datacube/getusersummary?access_token=ACCESS_TOKEN

	public int getUserCumulate();// 获取累计用户数据 7
									// https://api.weixin.qq.com/datacube/getusercumulate?access_token=ACCESS_TOKEN

	public int getArticleSummary();// 获取图文群发每日数据 1
									// https://api.weixin.qq.com/datacube/getarticlesummary?access_token=ACCESS_TOKEN

	public int getArticleTotal();// 获取图文群发总数据 1
									// https://api.weixin.qq.com/datacube/getarticletotal?access_token=ACCESS_TOKEN

	public int getUserRead();// 获取图文统计数据 3
								// https://api.weixin.qq.com/datacube/getuserread?access_token=ACCESS_TOKEN

	public int getUserReadHour();// 获取图文统计分时数据 1
									// https://api.weixin.qq.com/datacube/getuserreadhour?access_token=ACCESS_TOKEN

	public int getUserShare();// 获取图文分享转发数据 7
								// https://api.weixin.qq.com/datacube/getusershare?access_token=ACCESS_TOKEN

	public int getUserShareHour();// 获取图文分享转发分时数据 1
									// https://api.weixin.qq.com/datacube/getusersharehour?access_token=ACCESS_TOKEN
//接受认证事件
//============

	public int getInterfaceSummary();// 获取接口分析数据 30
										// https://api.weixin.qq.com/datacube/getinterfacesummary?access_token=ACCESS_TOKEN

	public int getInterfaceSummaryHour();// 获取接口分析分时数据 1
											// https://api.weixin.qq.com/datacube/getinterfacesummaryhour?access_token=ACCESS_TOKEN
//{ 
	// "begin_date": "2014-12-07",
//    "end_date": "2014-12-07"
//}
//============

}
