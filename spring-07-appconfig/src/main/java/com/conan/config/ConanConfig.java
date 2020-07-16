package com.conan.config;

import com.conan.pojo.User;
import org.springframework.context.annotation.Bean;

//@Configuration
public class ConanConfig {
    @Bean
    public User user() {
        return new User();
    }
}
