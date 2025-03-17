package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//@Controller
public class HelloController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
//    @RequestMapping(value = "/text", method = RequestMethod.GET)
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
