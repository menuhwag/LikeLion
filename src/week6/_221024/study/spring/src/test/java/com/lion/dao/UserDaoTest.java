package com.lion.dao;

import com.lion.domain.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired
    private UserDao dao;

    private User user1 = new User("id01", "짱구", "password");
    private User user2 = new User("id02", "철수", "password");
    private User user3 = new User("id03", "유리", "password");

    @BeforeEach
    void setUp() throws SQLException {
        dao.deleteAll();
    }

    @AfterEach
    void rollback() throws SQLException {
        dao.deleteAll();
    }

    @Test
    @DisplayName("추가 및 검색 테스트")
    void addAndFind() throws SQLException {
        dao.add(user1);

        User find = dao.findById(user1.getId());
        assertEquals(user1.getId(), find.getId());
        assertEquals(user1.getName(), find.getName());
        assertEquals(user1.getPassword(), find.getPassword());
    }

    @Test
    @DisplayName("모든 유저 조회")
    void getAll() throws SQLException {
        dao.add(user1);
        List<User> users1 = dao.getAll();
        assertEquals(1, users1.size());
        assertEquals(user1.getId(), users1.get(0).getId());

        dao.add(user2);
        List<User> users2 = dao.getAll();
        assertEquals(2, users2.size());
        assertEquals(user1.getId(), users2.get(0).getId());
        assertEquals(user2.getId(), users2.get(1).getId());

        dao.add(user3);
        List<User> users3 = dao.getAll();
        assertEquals(3, users3.size());
        assertEquals(user1.getId(), users3.get(0).getId());
        assertEquals(user2.getId(), users3.get(1).getId());
        assertEquals(user3.getId(), users3.get(2).getId());
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