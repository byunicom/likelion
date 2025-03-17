package com.example.beforsecurity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() throws InterruptedException{
        log.info("UserContoller hello() 실행"+Thread.currentThread().getName());

        Thread.sleep(1000);

        userService.test();

        return "hello"+UserContext.getUser().getName();

    }

    @GetMapping("/hi")
    public String hi() throws InterruptedException{
        log.info("UserContoller hi() 실행");
        Thread.sleep(2000);

//        userService.test();

        return "hi";
    }
}
