package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static private String URL = "jdbc:mysql://localhost:3306/pp_1_1_3-4?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static private String USERNAME = "root";
    static private String PASSWORD = "root";
    static public Connection getConnetion() throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }


}
