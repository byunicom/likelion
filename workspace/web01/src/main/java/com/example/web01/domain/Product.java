package com.example.web01.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

        System.out.println("p2");
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

        System.out.println("p3");
    }
}
