package com.jdbcpractice;

import java.sql.*;
import java.util.HashMap;
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

    public Map<String, Object> findById(String id) throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        String db_host = env.get("DB_HOST");
        String db_user = env.get("DB_USER");
        String db_pw = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                db_host, db_user, db_pw
        );

        PreparedStatement ps = conn.prepareStatement(
                String.format("SELECT seoul.id, seoul.address, seoul.name FROM seoul WHERE seoul.id = '%s'", id)
        );

        ResultSet result = ps.executeQuery();

        Map<String, Object> hospital = new HashMap<>();

        if (result.next()){
            hospital.put("id", result.getString(1));
            hospital.put("address", result.getString(2));
            hospital.put("name", result.getString(3));
        }

        ps.close();
        conn.close();

        return hospital;
    }
}
