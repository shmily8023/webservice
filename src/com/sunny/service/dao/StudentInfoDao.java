package com.sunny.service.dao;

//学生信息接口
public interface StudentInfoDao {

	public int addStudentInfo(); // 添加

	public int modifyStudentInfo(); // 修改

	public int delStudentInfo(); // 删除

	public int checkStudentInfo(); // 核验

	public int queryStudentInfoLog();// 查询学生信息记录

	public int queryStudentInfoLog(String s);// 根据指定条件查询学生信息记录
}
