package com.example.sample.config;

import com.example.sample.bean.Book;
import com.example.sample.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class MyBeanConfig {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public MyBean myBean2(){
        return new MyBean();
    }

    @Bean
    public MyBean myBean4(){
        return new MyBean("yungmi",30);
    }

    @Bean
    @Scope("prototype")
    public MyBean myBean3(){
        return new MyBean();
    }

    @Bean
    public Book book(){
        return new Book();
    }

    @Bean
    public Book book2(){
        return new Book();
    }
}
