package com.example.book;

public class Book {
    private String title;   //title 인스턴스 field(속성)
    private int price;      //price 인스턴스 field

    //Book 생성자
    public Book(String title, int price){
        this.title=title;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
