package com.likelion.springbootjdbcuserdao.dao;

import com.likelion.springbootjdbcuserdao.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDaoTest {
    @Autowired
    private UserDao userDao;

    private User user1 = new User("menu", "황민우", "1234");

    @BeforeEach
    void rollBack() {
        userDao.deleteAll();
    }

    @Test
    void addAndFindById() {
        userDao.add(user1);
        User find = userDao.findById(user1.getId());
        assertEquals(user1.getId(), find.getId());
        assertEquals(user1.getName(), find.getName());
        assertEquals(user1.getPassword(), find.getPassword());
    }

    @Test
    void deleteAll() {
    }

    @Test
    void findById() {
    }
}