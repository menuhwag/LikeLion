package com.lion.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDao awsUserDao() {
        return new UserDao(awsConnectionMaker(), jdbcContext());
    }

    @Bean ConnectionMaker awsConnectionMaker() {
        return new AwsConnectionMaker();
    }

    @Bean JdbcContext jdbcContext() {
        return new JdbcContext(awsConnectionMaker());
    }
}
