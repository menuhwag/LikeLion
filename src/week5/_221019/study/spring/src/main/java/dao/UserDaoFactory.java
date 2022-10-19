package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDao nUserDao() {
        return new UserDao(nConnectionMaker());
    }

    @Bean
    public ConnectionMaker nConnectionMaker() {
        return new NConnectionMaker();
    }
}
