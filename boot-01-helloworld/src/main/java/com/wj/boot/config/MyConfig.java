package com.wj.boot.config;

import com.wj.boot.bean.Pet;
import com.wj.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @ConditionalOnBean(name = "tom")
    @Bean
    public User user01() {
        return new User("zhangsan", 18);
    }

    @Bean("tom")
    public Pet tomcat() {
        return new Pet("tomcat");
    }
}
