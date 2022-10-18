package dao;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMarker connectionMarker = new NConnectionMarker();
        UserDao userDao = new UserDao(connectionMarker);
        return userDao;
    }
}
