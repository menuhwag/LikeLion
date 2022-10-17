package com.jdbcpractice;

import java.sql.*;
import java.util.Map;

public class HospitalDao {
    public void add(String id, String address, String name) throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String host = env.get("DB_HOST");
        String user = env.get("DB_USER");
        String pw = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                host, user, pw
        );

        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO seoul(id, address, name) VALUES (?, ?, ?)"
        );

        ps.setString(1, id);
        ps.setString(2, address);
        ps.setString(3, name);

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}
