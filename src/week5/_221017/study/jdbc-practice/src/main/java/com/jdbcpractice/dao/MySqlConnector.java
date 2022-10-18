package com.jdbcpractice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class MySqlConnector implements SqlConnector {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();

        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPW = env.get("DB_PASSWORD");

        Connection conn = null;

        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection(dbHost, dbUser, dbPW);

        return conn;
    }
}
