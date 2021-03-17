package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static String url = "jdbc:mysql://localhost:3306/_library";
    public static String user = "root";
    public static String password = "123456";

    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
        }
        System.out.println("数据库连接成功！");
        return conn;
    }
}
