package com.example.springmvc.controller;

import com.example.springmvc.domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("welcomeMessage","안녕하세요. 반갑습니다.");
        List<Item> items = Arrays.asList(
                new Item("사과",1.24),
                new Item("banana",0.77),
                new Item("orange",0.44)
        );
        model.addAttribute("items",items);
        return "welcome";
    }
}
