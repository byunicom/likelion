package com.example.web01.controller;

import com.example.web01.domain.Product;
import com.example.web01.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
//    private final Map<Long, Product> products = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Long id = counter.incrementAndGet();
        product.setId(id);
//        product.setName(product.getName());
//        product.setPrice(product.getPrice());
        Product createProduct = productService.addProduct(product.getId(), product.getName(), product.getPrice());
        return ResponseEntity.status(HttpStatus.CREATED).body(createProduct);
    }
}
