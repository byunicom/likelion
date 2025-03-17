package com.example.iocexam.config;

import com.example.iocexam.controller.UserController;
import com.example.iocexam.repository.UserDao;
import com.example.iocexam.repository.UserDaoImpl;
import com.example.iocexam.service.UserService;
import com.example.iocexam.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;

public class UserConfig {
    @Bean
    public UserDao userDao(){
        return new UserDaoImpl();
    }

    @Bean
    public UserService userService(UserDao userDao){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao);
        return userService;
    }

    @Bean
    public UserController userController(UserService userService){
        UserController userController = new UserController();
        userController.setUserService(userService);
        return userController;
    }
}
