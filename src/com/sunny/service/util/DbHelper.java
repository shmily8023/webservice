package com.sunny.service.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ���ݿ⹤���࣬������ɴ򿪡��ر����ݿ⣬ִ�в�ѯ�����
 * 
 * @author MKing
 *
 */
public class DbHelper {
	/**
	 * ���ݿ�URL
	 */
	private static final String URL = "jdbc:mysql://localhost:3306/ticket";
	/**
	 * ��¼�û���
	 */
	private static final String USER = "root";
	/**
	 * ��¼����
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
	 * ���ص���ģʽ�����ݿ⸨������
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
	 * ִ�в�ѯ
	 * 
	 * @param sql Ҫִ�е�SQL���
	 * @return ��ѯ�Ľ��������
	 * @throws Exception
	 */
	public ResultSet executeQuery(String sql) throws Exception {
		if (statement != null) {
			return statement.executeQuery(sql);
		}

		throw new Exception("���ݿ�δ��������");
	}

	/**
	 * ִ�в�ѯ
	 * 
	 * @param sql  Ҫִ�еĴ�������SQL���
	 * @param args SQL����еĲ���ֵ
	 * @return ��ѯ�Ľ��������
	 * @throws Exception
	 */
	public ResultSet executeQuery(String sql, Object... args) throws Exception {
		if (connection == null || connection.isClosed()) {
			DbHelper.close();
			throw new Exception("���ݿ�δ��������");
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
	 * �������
	 * 
	 * @param sql  Ҫִ�еĴ�������SQL���
	 * @param args SQL����еĲ���ֵ
	 * @return ��¼����
	 * @throws Exception
	 */
	public int getRows(String sql, Object... args) throws Exception {
		if (connection == null || connection.isClosed()) {
			DbHelper.close();
			throw new Exception("���ݿ�δ��������");
		}
		PreparedStatement ps = connection.prepareStatement(sql);
		int index = 1;
		for (Object arg : args) {
			ps.setObject(index, arg);
			index++;
		}
		ResultSet rs = ps.executeQuery();
		rs.last();// �ƶ������
		int myrow = rs.getRow();// ����

		return myrow;
	}

	/**
	 * ִ�и���
	 * 
	 * @param sql Ҫִ�е�SQL���
	 * @return ��Ӱ��ļ�¼����
	 * @throws SQLException
	 * @throws Exception    ��impl������
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
		// throw new Exception("���ݿ�δ��������");
		return 0;
	}

	/**
	 * ִ�и���
	 * 
	 * @param sql  Ҫִ�е�SQL���
	 * @param args SQL����еĲ���
	 * @return ��Ӱ��ļ�¼����
	 * @throws Exception
	 */
	public int executeUpdate(String sql, Object... args) {
		PreparedStatement ps = null;
		int returnNum;
		try {

			if (connection == null || connection.isClosed()) {
				DbHelper.close();
				returnNum=-1;//��Ҫ���� ����
				System.out.println("���ݿ�δ��������");
				//throw new Exception("���ݿ�δ��������");
			}
			ps = connection.prepareStatement(sql);
			int index = 1;
			for (Object arg : args) {
				ps.setObject(index, arg);
				index++;
			}
			returnNum=ps.executeUpdate();//�������� ��0 ���� ������
			connection.commit();//�ύ����
		} catch (Exception e) {
			System.out.println(e.getMessage());
			returnNum=-1;//��Ҫ���� ����
			try {
				System.out.println("�ع�����");
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println(e1.getMessage());
				//e1.printStackTrace();
				//�؝L
			}
		}
		return returnNum;

	}

	/**
	 * ��ȡԤ�����������
	 * 
	 * @param sql Ԥ��������
	 * @return Ԥ�����������
	 * @throws Exception
	 */
	public PreparedStatement prepareStatement(String sql) throws Exception {
		return connection.prepareStatement(sql);
	}

	/**
	 * �رն���ͬʱ���ر�����
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