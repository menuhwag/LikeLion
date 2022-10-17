package dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBConnector {
    Connection connect() throws SQLException, ClassNotFoundException;
    void close() throws SQLException;
}
