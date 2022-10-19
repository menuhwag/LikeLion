package dao;

import domain.User;
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
class NUserDaoTest {
    @Autowired
    ApplicationContext context;
    @Test
    @DisplayName("데이터 추가 및 읽기 테스트")
    void addAndGet() throws SQLException, ClassNotFoundException {
        UserDao dao = context.getBean(UserDaoFactory.class).nUserDao();
        User user1 = new User();
        user1.setId("whiteship");
        user1.setName("백기선");
        user1.setPassword("married");

        dao.add(user1);

        User user2 = dao.get(user1.getId());

        assertNotNull(user2.getId());
        assertNotNull(user2.getName());
        assertNotNull(user2.getPassword());

        assertEquals(user1.getId(), user2.getId());
        assertEquals(user1.getName(), user2.getName());
        assertEquals(user1.getPassword(), user2.getPassword());

        dao.deleteAll();
    }

    @Test
    @DisplayName("모든 데이터 삭제 테스트")
    void deleteAll() throws SQLException, ClassNotFoundException {
        UserDao dao = context.getBean(UserDaoFactory.class).nUserDao();
        User user1 = new User();
        user1.setId("whiteship");
        user1.setName("백기선");
        user1.setPassword("married");

        dao.add(user1);
        assertEquals(1, dao.getCountAll());

        dao.deleteAll();
        assertEquals(0, dao.getCountAll());
    }

    @Test
    @DisplayName("전체 데이터 개수 읽기 테스트")
    void getCountAll() throws SQLException, ClassNotFoundException {
        UserDao dao = context.getBean(UserDaoFactory.class).nUserDao();
        User user1 = new User();
        user1.setId("whiteship");
        user1.setName("백기선");
        user1.setPassword("married");

        dao.add(user1);

        int count = dao.getCountAll();

        assertEquals(1, count);

        dao.deleteAll();
    }
}