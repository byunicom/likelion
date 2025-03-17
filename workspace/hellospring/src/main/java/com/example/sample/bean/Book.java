package com.example.sample.bean;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;
    private int price;
    
    public Book(){
        System.out.println("Book 생성");
    }
}
