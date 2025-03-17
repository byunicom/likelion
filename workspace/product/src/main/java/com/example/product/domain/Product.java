package com.example.product.domain;

import com.example.product.ProductApplication;
import com.example.product.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    //DTO -> Entity로 변환하는 메서드
    public static Product fromDTO(ProductDTO productDTO){
        return Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .build();
    }

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }
}