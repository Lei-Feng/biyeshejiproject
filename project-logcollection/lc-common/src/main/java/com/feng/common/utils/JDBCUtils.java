package com.feng.common.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库连接工具类
 */
public class JDBCUtils {

    private static final String MYSQL_RIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String MYSQL_URL = "jdbc:mysql://192.168.233.121:3306/biyesheji?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    private static final String MYSQL_USERNAME = "root";
    private static final String MYSQL_PASSWORD = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(MYSQL_RIVER_CLASS);
            connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
