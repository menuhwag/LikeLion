package com.lion.dao;

public class UserDaoFactory {
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker() {
        return new AwsConnectionMaker();
    }
}
