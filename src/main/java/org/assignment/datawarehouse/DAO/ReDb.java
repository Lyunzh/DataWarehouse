package org.assignment.datawarehouse.DAO;

import java.sql.*;

public class ReDb  {
    private static String url = "jdbc:mysql://8.153.70.141:3306/movie";  // 替换为实际的数据库URL
    private static String username = "root";  // 替换为实际的用户名
    private static String password = "Tongjidb2024";  // 替换为实际的密码

    private static Connection conn;

    public ReDb() throws Exception  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 连接数据库
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    // 关闭连接
    public void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

}
