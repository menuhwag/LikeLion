package com.lion.dao;

import com.lion.domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final User user) throws SQLException {
        this.jdbcTemplate.update("INSERT INTO users(id, name, password) VALUES (? , ?, ?)", user.getId(), user.getName(), user.getPassword());
    }

    public User findById(String id) throws SQLException {
        try {
            return this.jdbcTemplate.queryForObject("SELECT * FROM users WHERE users.id = ?", new RowMapper<User>() {
                @Override
                public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                    System.out.println(rowNum);
                    return new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                }
            }, id);
        } catch (DataAccessException e) {
            return null;
        }
    }

    public List<User> getAll() {
        return this.jdbcTemplate.query("SELECT * FROM users ORDER BY id", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
                return user;
            }
        });
    }

    public int getCountAll() throws SQLException {
        return this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users",Integer.class);
    }

    public void deleteAll() throws SQLException{
        this.jdbcTemplate.update("DELETE FROM users");
    }
}
