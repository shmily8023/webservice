package com.sunny.service.vo.log;

public class Log_Search {
	//=======搜索记录 用户形成搜索热门===========//
	public int ids;//编号
	public long searchTime;//搜索时间
	public int searchArea;//搜索区域
	public String searchUser;//搜索用户
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public long getSearchTime() {
		return searchTime;
	}
	public void setSearchTime(long searchTime) {
		this.searchTime = searchTime;
	}
	public int getSearchArea() {
		return searchArea;
	}
	public void setSearchArea(int searchArea) {
		this.searchArea = searchArea;
	}
	public String getSearchUser() {
		return searchUser;
	}
	public void setSearchUser(String searchUser) {
		this.searchUser = searchUser;
	}
	
}
