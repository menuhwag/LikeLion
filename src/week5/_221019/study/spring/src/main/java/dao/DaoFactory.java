package dao;

public class DaoFactory {
    public UserDao userDao() {
        return new UserDao(nConnectionMaker());
    }

    private ConnectionMaker nConnectionMaker() {
        return new NConnectionMaker();
    }
}
