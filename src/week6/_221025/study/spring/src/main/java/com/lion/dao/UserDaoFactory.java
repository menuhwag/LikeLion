package com.lion.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDao userDao(DataSource dataSource, JdbcContext jdbcContext) {
        return new UserDao(dataSource, jdbcContext);
    }

    @Bean
    public DataSource dataSource() {
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword(env.get("DB_PASSWORD"));
        return dataSource;
    }

    @Bean
    public JdbcContext jdbcContext(DataSource dataSource) {
        return new JdbcContext(dataSource);
    }
}
