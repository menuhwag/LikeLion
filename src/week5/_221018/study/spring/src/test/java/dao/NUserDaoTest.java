package dao;

import domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class NUserDaoTest {
    @Test
    void addAndGet() throws SQLException, ClassNotFoundException {
        ConnectionMarker connectionMarker = new NConnectionMarker();
        UserDao dao = new UserDao(connectionMarker);

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
    }
}