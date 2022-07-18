package com.example.oauth2.configuration;

import com.example.oauth2.service.UserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebMvcConfig {

    @Bean
    public UserDetailService userDetailService(){
        return new UserDetailService();
    }
}
