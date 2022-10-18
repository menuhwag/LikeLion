package com.jdbcpractice.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface SqlConnector {
    Connection getConnection() throws SQLException, ClassNotFoundException;
}
