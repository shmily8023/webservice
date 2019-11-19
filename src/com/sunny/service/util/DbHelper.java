package com.sunny.service.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 数据库工具类，负责完成打开、关闭数据库，执行查询或更新
 * 
 * @author MKing
 *
 */
public class DbHelper {
	/**
	 * 数据库URL
	 */
	private static final String URL = "jdbc:mysql://localhost:3306/ticket";
	/**
	 * 登录用户名
	 */
	private static final String USER = "root";
	/**
	 * 登录密码
	 */
	private static final String PASSWORD = "root";

	private static Connection connection = null;
	private static Statement statement = null;

	private static DbHelper helper = null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public DbHelper() throws Exception {
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
		statement = connection.createStatement();
		connection.setAutoCommit(false);
	}

	/**
	 * 返回单例模式的数据库辅助对象
	 * 
	 * @return
	 * @throws Exception
	 */
	public static DbHelper getDbHelper() throws Exception {
		if (helper == null || connection == null || connection.isClosed())
			helper = new DbHelper();
		return helper;
	}

	/**
	 * 执行查询
	 * 
	 * @param sql 要执行的SQL语句
	 * @return 查询的结果集对象
	 * @throws Exception
	 */
	public ResultSet executeQuery(String sql) throws Exception {
		if (statement != null) {
			return statement.executeQuery(sql);
		}

		throw new Exception("数据库未正常连接");
	}

	/**
	 * 执行查询
	 * 
	 * @param sql  要执行的带参数的SQL语句
	 * @param args SQL语句中的参数值
	 * @return 查询的结果集对象
	 * @throws Exception
	 */
	public ResultSet executeQuery(String sql, Object... args) throws Exception {
		if (connection == null || connection.isClosed()) {
			DbHelper.close();
			throw new Exception("数据库未正常连接");
		}
		PreparedStatement ps = connection.prepareStatement(sql);
		int index = 1;
		for (Object arg : args) {
			ps.setObject(index, arg);
			index++;
		}

		return ps.executeQuery();
	}

	/**
	 * 结果行数
	 * 
	 * @param sql  要执行的带参数的SQL语句
	 * @param args SQL语句中的参数值
	 * @return 记录行数
	 * @throws Exception
	 */
	public int getRows(String sql, Object... args) throws Exception {
		if (connection == null || connection.isClosed()) {
			DbHelper.close();
			throw new Exception("数据库未正常连接");
		}
		PreparedStatement ps = connection.prepareStatement(sql);
		int index = 1;
		for (Object arg : args) {
			ps.setObject(index, arg);
			index++;
		}
		ResultSet rs = ps.executeQuery();
		rs.last();// 移动到最后
		int myrow = rs.getRow();// 行数

		return myrow;
	}

	/**
	 * 执行更新
	 * 
	 * @param sql 要执行的SQL语句
	 * @return 受影响的记录条数
	 * @throws SQLException
	 * @throws Exception    事務impl。。。
	 */
	public int executeUpdate(String sql) {
		try {
			if (statement != null) {
				return statement.executeUpdate(sql);
			}
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				// e1.printStackTrace();
			}
		}
		// throw new Exception("数据库未正常连接");
		return 0;
	}

	/**
	 * 执行更新
	 * 
	 * @param sql  要执行的SQL语句
	 * @param args SQL语句中的参数
	 * @return 受影响的记录条数
	 * @throws Exception
	 */
	public int executeUpdate(String sql, Object... args) {
		PreparedStatement ps = null;
		int returnNum;
		try {

			if (connection == null || connection.isClosed()) {
				DbHelper.close();
				returnNum=-1;//需要細化 返回
				System.out.println("数据库未正常连接");
				//throw new Exception("数据库未正常连接");
			}
			ps = connection.prepareStatement(sql);
			int index = 1;
			for (Object arg : args) {
				ps.setObject(index, arg);
				index++;
			}
			returnNum=ps.executeUpdate();//返回内容 》0 代表 更新行
			connection.commit();//提交数据
		} catch (Exception e) {
			System.out.println(e.getMessage());
			returnNum=-1;//需要細化 返回
			try {
				System.out.println("回滚操作");
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println(e1.getMessage());
				//e1.printStackTrace();
				//回滾
			}
		}
		return returnNum;

	}

	/**
	 * 获取预编译的语句对象
	 * 
	 * @param sql 预编译的语句
	 * @return 预编译的语句对象
	 * @throws Exception
	 */
	public PreparedStatement prepareStatement(String sql) throws Exception {
		return connection.prepareStatement(sql);
	}

	/**
	 * 关闭对象，同时将关闭连接
	 */
	public static void close() {
		try {
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			helper = null;
		}
	}
}