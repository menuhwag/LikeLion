package dao;

import java.sql.SQLException;

public interface SqlConnector {
    java.sql.Connection getConnection() throws ClassNotFoundException, SQLException;
}
