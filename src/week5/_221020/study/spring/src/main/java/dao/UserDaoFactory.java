package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDao awsUserDao() {
        return new UserDao(awsConnectionMaker());
    }

    @Bean
    public UserDao localUserDao() {
        return new UserDao(localConnectionMaker());
    }

    @Bean
    public ConnectionMaker awsConnectionMaker() {
        return new AwsConnectionMaker();
    }

    @Bean
    public ConnectionMaker localConnectionMaker() {
        return new LocalConnectionMaker();
    }
}
