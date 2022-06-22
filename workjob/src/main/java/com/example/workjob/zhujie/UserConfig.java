package com.example.workjob.zhujie;

import com.example.workjob.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UserConfig {
    @Bean("user2")
    public User getDataSource(){
        User user = new User();
        user.setUserId(11111);
        user.setUserName("注解");
        return user;
    }
}
