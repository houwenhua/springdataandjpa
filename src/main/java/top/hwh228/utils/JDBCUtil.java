package top.hwh228.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 *JDBC工具类
 * 1）获得Connection
 * 2）释放资源
 *
 * */
public class JDBCUtil {

    /**
     * 获得Connection
     * */
    public static Connection getConnection() throws Exception {
        /*String url = "jdbc:mysql:///world";
        String user = "root";
        String password = "123456";
        String driverClass = "com.mysql.jdbc.Driver";*/
        //获得配置文件中的连接信息
        InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(is);

        String url = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.user");
        String password = properties.getProperty("jdbc.password");
        String driverClass = properties.getProperty("jdbc.driverClass");

        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }


    /**
     * 释放资源
     * */
    public static void release (ResultSet rs , Statement state , Connection conn) {

        //region Description
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //endregion
        if(state != null){
            try {
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
