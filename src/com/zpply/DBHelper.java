package com.zpply;
import java.io.*;  
import java.sql.*;  
import java.util.*;  

import java.io.Console;
import java.sql.*;
import java.util.Enumeration;
//import java.util.logging.*;
//import javax.swing.table.*;

/**
 * SQL �������� ������,���������������� JDBC ������������
 * 
 * @author Null
 */
public class DBHelper {

    /**
     * ����
     */
    // public static String driver =
    // "com.microsoft.jdbc.sqlserver.SQLServerDriver";
    public static String driver = "com.mysql.jdbc.Driver";
    /**
     * ����������
     */
    // public static String url =
    // "jdbc:microsoft:sqlserver://127.0.0.1:1433;DatabaseName=st";
    public static String url = "jdbc:mysql://119.3.185.155:3306/crmeb?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false";
    /**
     * ������
     */
    public static String user = "crmeb";
    /**
     * ����
     */
    public static String password = "m63dZHmPBG26NxzE";

    /**
     * ����������������
     */


    /**
     * ������������������ ������������ driver / url / user / password ���������������� ������������������
     * 
     * @return ����������
     */
    public static Connection getConnection() {
        try {
            // ��������
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
        }

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * �������� Statement �� Statement �������������� ��������,��������
     * 
     * @return ������������������ null,��������������������
     */
    public static Statement getStatement() {
        Connection conn = getConnection();
        if (conn == null) {
            return null;
        }
        try {
            return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            // ������������������������������������������������������������
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            close(conn);
        }
        return null;
    }

    /**
     * �������� Statement �� Statement �������������� ��������,��������
     * 
     * @param conn
     *            ����������
     * @return ������������������ null,��������������������
     */
    public static Statement getStatement(Connection conn) {
        if (conn == null) {
            return null;
        }
        try {

            return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            // ������������������,��������
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            return null;
        }
    }

    /**
     * ���������������� PreparedStatement �� PreparedStatement �������������� ��������,��������
     * 
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return ������������������ null,��������������������
     */
    public static PreparedStatement getPreparedStatement(String cmdText,
            Object[] cmdParams) {
        Connection conn = getConnection();
        if (conn == null) {
            return null;
        }

        PreparedStatement pstmt = null;
        try {

            pstmt = conn
                    .prepareStatement(cmdText, ResultSet.TYPE_SCROLL_SENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            int i = 1;
            for (Object item : cmdParams) // java
                                            // foreach��������,��������������Enumeration����
            {
                pstmt.setObject(i, item);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            close(conn);
        }
        return pstmt;
    }

    /**
     * ���������������� PreparedStatement �� PreparedStatement �������������� ��������,��������
     * 
     * @param conn
     *            ����������
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return ������������������ null,��������������������
     */
    public static PreparedStatement getPreparedStatement(Connection conn,
            String cmdText, Object[] cmdParams) {
        if (conn == null) {
            return null;
        }

        PreparedStatement pstmt = null;
        try {
            pstmt = conn
                    .prepareStatement(cmdText, ResultSet.TYPE_SCROLL_SENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            int i = 1;
            for (Object item : cmdParams) {
                pstmt.setObject(i, item);
                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            // ex.printStackTrace();
            close(pstmt);
        }
        return pstmt;
    }

    /**
     * ���� SQL ����,�������������� ����������������������
     * 
     * @param cmdText
     *            SQL ����
     * @return ������:��������; -1:��������; -2:��������
     */
    public static int ExecSql(String cmdText) {
        Statement stmt = getStatement();
        if (stmt == null) {
            return -2;
        }
        int i;
        try {
            i = stmt.executeUpdate(cmdText);
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null,ex);
            System.out.println(ex.getMessage());
            i = -1;
        }
        closeConnection(stmt);
        return i;
    }

    /**
     * ���� SQL ����,�������������� ����������������������
     * 
     * @param cmdText
     *            SQL ����
     * @return ������:��������; -1:��������; -2:��������
     */
    public static int ExecSql(Connection conn, String cmdText) {
        Statement stmt = getStatement(conn);
        if (stmt == null) {
            return -2;
        }
        int i;
        try {
            i = stmt.executeUpdate(cmdText);

        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());

            i = -1;
        }
        close(stmt);
        return i;
    }

    /**
     * ���� SQL ����,�������������� ����������������������
     * 
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return ������:��������; -1:��������; -2:��������
     */
    public static int ExecSql(String cmdText, Object[] cmdParams) {
        PreparedStatement pstmt = getPreparedStatement(cmdText, cmdParams);
        if (pstmt == null) {
            return -2;
        }
        int i;
        try {
            i = pstmt.executeUpdate();
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            i = -1;
        }
        closeConnection(pstmt);
        return i;
    }

    /**
     * ���� SQL ����,�������������� ����������������������
     * 
     * @param conn
     *            ����������
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return ������:��������; -1:��������; -2:��������
     */
    public static int ExecSql(Connection conn, String cmdText,
            Object[] cmdParams) {
        PreparedStatement pstmt = getPreparedStatement(conn, cmdText, cmdParams);
        if (pstmt == null) {
            return -2;
        }
        int i;
        try {
            i = pstmt.executeUpdate();

        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            i = -1;
        }
        close(pstmt);
        return i;
    }

    /**
     * ����������������������������,��������
     * 
     * @param cmdText
     *            SQL ����
     * @return
     */
    public static Object ExecScalar(String cmdText) {
        ResultSet rs = getResultSet(cmdText);
        Object obj = getScalar(rs);
        closeConnection(rs);
        return obj;
    }

    /**
     * ����������������������������,��������
     * 
     * @param conn
     *            ����������
     * @param cmdText
     *            SQL ����
     * @return
     */
    public static Object ExecScalar(Connection conn, String cmdText) {
        ResultSet rs = getResultSet(conn, cmdText);
        Object obj = getScalar(rs);
        closeEx(rs);
        return obj;
    }

    /**
     * ����������������������������,��������
     * 
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return
     */
    public static Object ExecScalar(String cmdText, Object[] cmdParams) {
        ResultSet rs = getResultSet(cmdText, cmdParams);
        Object obj = getScalar(rs);
        closeConnection(rs);
        return obj;
    }

    /**
     * ����������������������������,��������
     * 
     * @param conn
     *            ����������
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return
     */
    public static Object ExecScalar(Connection conn, String cmdText,
            Object[] cmdParams) {
        ResultSet rs = getResultSet(conn, cmdText, cmdParams);
        Object obj = getScalar(rs);
        closeEx(rs);
        return obj;
    }

    /**
     * �������� ResultSet
     * 
     * @param cmdText
     *            SQL ����
     * @return
     */
    public static ResultSet getResultSet(String cmdText) {
        Statement stmt = getStatement();
        if (stmt == null) {
            return null;
        }
        try {
            return stmt.executeQuery(cmdText);
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            closeConnection(stmt);
        }
        return null;
    }

    /**
     * �������� ResultSet
     * 
     * @param conn
     * @param cmdText
     *            SQL ����
     * @return
     */
    public static ResultSet getResultSet(Connection conn, String cmdText) {
        Statement stmt = getStatement(conn);
        if (stmt == null) {
            return null;
        }
        try {
            return stmt.executeQuery(cmdText);
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            close(stmt);
        }
        return null;
    }

    /**
     * �������� ResultSet
     * 
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return
     */
    public static ResultSet getResultSet(String cmdText, Object[] cmdParams) {
        PreparedStatement pstmt = getPreparedStatement(cmdText, cmdParams);
        if (pstmt == null) {
            return null;
        }
        try {
            return pstmt.executeQuery();
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            closeConnection(pstmt);
        }
        return null;
    }

    /**
     * �������� ResultSet
     * 
     * @param conn
     *            ����������
     * @param cmdText
     *            ���� ? ������ SQL ����
     * @param cmdParams
     *            SQL ������������
     * @return
     */
    public static ResultSet getResultSet(Connection conn, String cmdText,
            Object[] cmdParams) {
        PreparedStatement pstmt = getPreparedStatement(conn, cmdText, cmdParams);
        if (pstmt == null) {
            return null;
        }
        try {
            return pstmt.executeQuery();
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
            close(pstmt);
        }
        return null;
    }

    public static Object getScalar(ResultSet rs) {
        if (rs == null) {
            return null;
        }
        Object obj = null;
        try {
            if (rs.next()) {
                obj = rs.getObject(1);
            }
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
        }
        return obj;
    }

    private static void close(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof Statement) {
                ((Statement) obj).close();
            } else if (obj instanceof PreparedStatement) {
                ((PreparedStatement) obj).close();
            } else if (obj instanceof ResultSet) {
                ((ResultSet) obj).close();
            } else if (obj instanceof Connection) {
                ((Connection) obj).close();
            }
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
        }
    }

    private static void closeEx(Object obj) {
        if (obj == null) {
            return;
        }

        try {
            if (obj instanceof Statement) {
                ((Statement) obj).close();
            } else if (obj instanceof PreparedStatement) {
                ((PreparedStatement) obj).close();
            } else if (obj instanceof ResultSet) {
                ((ResultSet) obj).getStatement().close();
            } else if (obj instanceof Connection) {
                ((Connection) obj).close();
            }
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
        }

    }

    private static void closeConnection(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof Statement) {
                ((Statement) obj).getConnection().close();
            } else if (obj instanceof PreparedStatement) {
                ((PreparedStatement) obj).getConnection().close();
            } else if (obj instanceof ResultSet) {
                ((ResultSet) obj).getStatement().getConnection().close();
            } else if (obj instanceof Connection) {
                ((Connection) obj).close();
            }
        } catch (SQLException ex) {
            // Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE,
            // null, ex);
            System.out.println(ex.getMessage());
        }
    }
}
