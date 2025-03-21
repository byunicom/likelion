package com.example.sample.bean;

//import com.example.sample.config.MyBeanConfig;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class MyBean {
    private String name;
    private int count;

    public MyBean(){
        System.out.println("MyBean 생성!!");
    }

    public MyBean(String name, int count){
        this.name=name;
        this.count=count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
