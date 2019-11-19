package com.sunny.service.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sunny.service.dao.UserDao;
import com.sunny.service.dao.WxDao;
import com.sunny.service.util.DbHelper;
import com.sunny.service.util.JsonData;
import com.sunny.service.vo.user.WxUser;

public class UserDaoImpl implements WxDao, UserDao {
	DbHelper d;
	/*
	 * @Override public int addWxUser() { // TODO Auto-generated method stub try {
	 * d=new DbHelper(); WxUser wuser = JSON.parseObject(JsonData.wxUserBaseData,
	 * WxUser.class); Object[] obj = new
	 * Object[]{wuser.city,wuser.country,wuser.headimgurl}; String
	 * sql2="Insert Into wxuser(city,country,headimgurl) Values (?,?,?)";
	 * d.executeUpdate(sql2, obj); System.out.println(wuser.subscribe_time);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return 0; }
	 */

	@Override
	public void addServiceUser() {
		// TODO 增加客服用户

	}

	@Override
	public void updateServiceStatus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateServiceNickName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void queryServiceUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delServiceUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public int addWxUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBlockWxUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getPayPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setPayPassword() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List getWxUserDetailByOpenId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getWxUserDetailById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getUserByCustomerQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setDistUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDistUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setCurrentUserSign() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int resetUserSignInfo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addTicketUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delTicketUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTicketUserPassword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTicketUserVaidDate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkTicketUserLimitProduct() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTicketUserStatus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTicketUserLimitProduct() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSupplyUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delSupplyUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSupplyUserPassword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addProxyUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delProxyUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProxyUserPassword() {
		// TODO Auto-generated method stub

	}

	@Override
	public int addUserAddressInfo(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyUserAddressInfo(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delUserAddressInfo(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUserDefaultAddressSwitch(int id, boolean status) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addWxConfig() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyWxConfig() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delWxConfig() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int testWxConfig() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserTag() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserGroup() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUserTag() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUserGroup() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserList() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserDetail() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendSubscribeMessage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendNoSubscribeMessage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendKeyWordMessage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int uploadPic() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int uploadVideo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int uploadAudio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendGroupTextMessage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendGroupPicMessage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendGroupVideoMessage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sendGroupAudioMessage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUserRemark() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBlockUserList() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBlockUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int transToShortUrl() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserSummary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserCumulate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getArticleSummary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getArticleTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserRead() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserReadHour() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserShare() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUserShareHour() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getInterfaceSummary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getInterfaceSummaryHour() {
		// TODO Auto-generated method stub
		return 0;
	}

}
