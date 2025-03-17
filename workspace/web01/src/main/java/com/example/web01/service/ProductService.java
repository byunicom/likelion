package com.example.web01.service;

import com.example.web01.domain.Product;
import com.example.web01.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional
    public Product addProduct(Long id, String name, double price){
        System.out.println("addProduct");
        return productRepository.save(new Product());
    }
}
