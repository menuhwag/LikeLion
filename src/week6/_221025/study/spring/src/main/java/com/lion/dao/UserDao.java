package com.lion.dao;

import com.lion.domain.User;

import java.sql.*;
import java.util.Map;

public class UserDao {
    public void add(final User user) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));

        PreparedStatement ps = c.prepareStatement("INSERT INTO users(id, name, password) VALUES (?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));

        PreparedStatement ps = c.prepareStatement(
                "SELECT * FROM users WHERE id = ?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();

        User user = null;
        if (rs.next()) {
            user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        }

        rs.close();
        ps.close();
        c.close();

        return user;
    }

    public int getCount() throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));

        PreparedStatement ps = c.prepareStatement("SELECT  COUNT(*) FROM users");

        ResultSet rs = ps.executeQuery();
        rs.next();
        int count = rs.getInt(1);

        rs.close();
        ps.close();
        c.close();

        return count;
    }

    public void deleteAll() throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));

        PreparedStatement ps = c.prepareStatement("DELETE FROM users");

        ps.executeUpdate();

        ps.close();
        c.close();
    }
}
