package com.sliwa.drewnobud;

import com.sliwa.drewnobud.service.UserService;
import com.sliwa.drewnobud.service.UserServiceImpl;
import com.sliwa.drewnobud.validator.UserValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;

@SpringBootApplication
public class DrewnobudApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(DrewnobudApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DrewnobudApplication.class, args);
    }

    @Bean
    public UserService userService() throws Exception{
        return new UserServiceImpl();
    }

    @Bean
    public UserValidator userValidator() throws Exception{
        return new UserValidator();
    }

}
