package com.jdbcpractice;

import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception{
        UserDao userDao = new UserDao();
//        userDao.add("철수", "passw0rd");

        Map<String, Object> user = userDao.findById(3L);
        for (String key : user.keySet()) {
            System.out.printf("%s=%s\n", key, user.get(key));
        }
    }
}
