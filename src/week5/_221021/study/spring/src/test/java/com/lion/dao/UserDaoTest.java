package com.lion.dao;

import com.lion.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired
    private ApplicationContext applicationContext;

    private UserDao dao;

    private User user1 = new User("menu", "황민우", "password");

    @BeforeEach
    void setUp() {
        dao = (UserDao) applicationContext.getBean("awsUserDao");
    }

    @Test
    @DisplayName("추가 및 검색 테스트")
    void addAndFind() throws SQLException {
        dao.add(user1);

        User find = dao.findById(user1.getId());
        assertEquals(user1.getId(), find.getId());
        assertEquals(user1.getName(), find.getName());
        assertEquals(user1.getPassword(), find.getPassword());

        dao.deleteAll();
    }

    @Test
    @DisplayName("해당 id의 유저가 없을 경우")
    void notFoundUser() throws SQLException{
        User find = dao.findById("ThisIsNotId");

        assertNull(find);
    }

    @Test
    @DisplayName("전체 카운트 테스트")
    void getCountAll()  throws SQLException {
        dao.add(user1);
        assertEquals(1, dao.getCountAll());
        dao.deleteAll();
    }

    @Test
    @DisplayName("삭제 테스트")
    void deleteAll() throws SQLException{
        dao.add(user1);
        assertEquals(1, dao.getCountAll());
        dao.deleteAll();
        assertNull(dao.findById(user1.getId()));
        assertEquals(0, dao.getCountAll());
    }
}