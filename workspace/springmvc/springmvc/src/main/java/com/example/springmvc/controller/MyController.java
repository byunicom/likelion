package com.example.springmvc.controller;

//import ch.qos.logback.core.model.Model;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/home")
    public String home(@RequestParam(value="name") String name, Model model){
        System.out.println(name);

        model.addAttribute("name",name);

        return "home";
    }
}
