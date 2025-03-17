package com.example.web01.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyRestController {
    // GET 요청 처리 예제
    @GetMapping("/api/greeting")
    public Map<String, String> greet(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, " + name + "!");
        return response;
    }

//    @GetMapping(value = "/api/user", produces = "application/json")
//    public User getUser(@RequestParam(name="name") String name){
//        return new User(name,"010-111-1111","경기도 고양시");
//    }

    @GetMapping("/api/users")
    public List<User> getUsers(){

        return null;
    }
}