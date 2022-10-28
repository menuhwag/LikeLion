package com.likelion.springbootjdbcuserdao.dao;

import com.likelion.springbootjdbcuserdao.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {
    private final JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(User user){
        this.jdbcTemplate.update("insert into users(id, name, password) values(?,?,?)",
                user.getId(), user.getName(), user.getPassword());
    }

    public void deleteById(String id) {
        this.jdbcTemplate.update("delete from users WHERE id=?", id);
    }

    public int deleteAll() {
        return this.jdbcTemplate.update("delete from users");
    }

    public User findById(String id) {
        User user = null;
        user = this.jdbcTemplate.queryForObject("SELECT * FROM users WHERE id=?", userMapper, id);
        if (user == null) throw new RuntimeException("해당하는 유저를 찾을 수 없습니다.");
        return user;
    }

    public int getCount() {
        int count = 0;
        count = this.jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users", Integer.class);
        return count;
    }

    private final RowMapper<User> userMapper = new RowMapper<>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        }
    };
}
