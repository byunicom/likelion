package com.example.book;

public class BookExam01 {
    public static void main(String[] args) {
        Book book = new Book("Java", 1000);
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
    }
}
