package com.jdbcpractice.dao;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class UserDao {
    public void add(String name, String password) throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String host = env.get("DB_HOST");
        String user = env.get("DB_USER");
        String pw = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                host, user, pw
        );

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(name, password) VALUES (?, ?)"
        );

        ps.setString(1, name);
        ps.setString(2, password);

        ps.executeUpdate();

        ps.close();
        conn.close();
    }

    public Map<String, Object> findById(Long id) throws SQLException, ClassNotFoundException{
        Map<String, String> env = System.getenv();
        String db_host = env.get("DB_HOST");
        String db_user = env.get("DB_USER");
        String db_pw = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                db_host, db_user, db_pw
        );

        PreparedStatement ps = conn.prepareStatement(
                String.format("SELECT * FROM users WHERE users.id = %d", id)
        );

        ResultSet result = ps.executeQuery();

        Map<String, Object> user = new HashMap<>();

        if (result.next()){
            user.put("id", result.getInt(1));
            user.put("name", result.getString(2));
            user.put("password", result.getString(3));
        }

        ps.close();
        conn.close();

        return user;
    }
}
