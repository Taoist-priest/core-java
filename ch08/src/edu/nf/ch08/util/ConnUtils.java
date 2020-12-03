package edu.nf.ch08.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author wangl
 * @date 2020/10/22
 *
 */
public class ConnUtils {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/weather?useSSL=false&useUnicode=true&characterEncoding=utf-8";
    private static String user = "root";
    private static String password = "root";

    static {
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("获取连接异常", e);
        }
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
