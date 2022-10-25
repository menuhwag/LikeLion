package com.lion.dao;

import com.lion.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final User user) {
        this.jdbcTemplate.update("INSERT INTO users(id, name, password) VALUES (?, ?, ?)", user.getId(), user.getName(), user.getPassword());
    }

    public User get(String id) {
        User user = null;
        user = this.jdbcTemplate.queryForObject("SELECT * FROM users WHERE id = ?", userMapper(), id);
        if (user == null) throw new EmptyResultDataAccessException(1);
        return user;
    }

    public int getCount() {
        int count = 0;
        count = this.jdbcTemplate.queryForObject("SELECT  COUNT(*) FROM users", Integer.class);
        return count;
    }

    public void deleteAll() throws SQLException {
        this.jdbcTemplate.update("DELETE FROM users");
    }

    private RowMapper<User> userMapper() {
        return (rs, rowNum) -> new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
    }
}
