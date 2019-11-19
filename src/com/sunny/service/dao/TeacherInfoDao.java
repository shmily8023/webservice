package com.sunny.service.dao;

public interface TeacherInfoDao {


	public int addTeacherInfo(); // 添加

	public int modifyTeacherInfo(); // 修改

	public int delTeacherInfo(); // 删除

	public int checkTeacherInfo(); // 核验

	public int queryTeacherInfoLog();// 查询所有教师信息

	public int queryTeacherInfoLog(String s);// 根据指定条件查询教师信息

}
