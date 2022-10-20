package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class AwsConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Map<String, String> env = System.getenv();
        String DB_HOST = env.get("DB_HOST");
        String DB_USER = env.get("DB_USER");
        String DB_PASSWORD = env.get("DB_PASSWORD");

        Connection c = DriverManager.getConnection(DB_HOST, DB_USER, DB_PASSWORD);

        return c;
    }
}
