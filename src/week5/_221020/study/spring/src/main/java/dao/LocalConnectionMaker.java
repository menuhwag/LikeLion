package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost", "test", "password");
        return c;
    }
}
