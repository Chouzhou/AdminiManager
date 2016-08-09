package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by paiopiao on 2015/6/30.
 */
public class DataBase {
    public Connection conn = null;

    public void initConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/apms";
        String dbName = "root";
        String dbPwd = "zsw19941202";
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, dbName, dbPwd);
    }

    public void closeConnection() throws Exception {
        if (conn != null) {
            conn.close();
        }
    }
}
