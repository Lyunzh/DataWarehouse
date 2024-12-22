package org.assignment.datawarehouse.DAO;

import java.sql.*;

public class HiveDb {

    private static String driver = "org.apache.hive.jdbc.HiveDriver";
    private static  final String url = "jdbc:hive2://8.153.70.141:10000/metastore";
    private static Connection conn = null;

    private static Statement stmt = null;


    public HiveDb() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

}
