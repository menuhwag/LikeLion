package com.lion.dao;

import com.lion.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired
    private UserDao dao;

    private User user1 = new User("menu", "minwoo", "1234");
    private User user2 = new User("hwang", "hwang", "1234");

    @Nested
    @DisplayName("추가")
    class AddTest {
        @BeforeEach()
        void clear() throws SQLException, ClassNotFoundException {
            dao.deleteAll();
        }

        @Test
        @DisplayName("정상")
        void addAndGet() throws SQLException, ClassNotFoundException {
            dao.add(user1);
            User find = dao.get(user1.getId());
            assertEquals(user1.getId(), find.getId());
            assertEquals(user1.getName(), find.getName());
            assertEquals(user1.getPassword(), find.getPassword());
        }
    }

    @Nested
    @DisplayName("검색")
    class GetTest {
        @BeforeEach()
        void clear() throws SQLException, ClassNotFoundException {
            dao.deleteAll();
        }

        @Test
        @DisplayName("네거티브 테스트 : 검색결과 없음")
        void notFoundUser() throws SQLException, ClassNotFoundException {
            User find = dao.get("NoUser");
            assertNull(find);
        }

        @Test
        @DisplayName("정상")
        void get() throws SQLException, ClassNotFoundException {
            dao.add(user1);
            User find = dao.get(user1.getId());

            assertEquals(user1.getId(), find.getId());
            assertEquals(user1.getName(), find.getName());
            assertEquals(user1.getPassword(), find.getPassword());
        }
    }

    @Nested
    @DisplayName("카운트")
    class Count {
        @BeforeEach()
        void clear() throws SQLException, ClassNotFoundException {
            dao.deleteAll();
        }

        @Test
        @DisplayName("검색 결과 0")
        void getCountZero() throws SQLException, ClassNotFoundException {
            assertEquals(0, dao.getCount());
        }

        @Test
        @DisplayName("정상")
        void getCount() throws SQLException, ClassNotFoundException {
            dao.add(user1);
            assertEquals(1, dao.getCount());
            dao.add(user2);
            assertEquals(2, dao.getCount());
        }
    }

    @Nested
    @DisplayName("삭제")
    class Delete {
        @BeforeEach()
        void clear() throws SQLException, ClassNotFoundException {
            dao.deleteAll();
        }

        @Test
        @DisplayName("정상 : 전체 삭제")
        void deleteAll() throws SQLException, ClassNotFoundException {
            dao.add(user1);
            dao.add(user2);
            dao.deleteAll();
            assertEquals(0, dao.getCount());
        }
    }
}