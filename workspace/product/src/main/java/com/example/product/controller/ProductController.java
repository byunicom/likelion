package com.example.product.controller;

import com.example.product.dto.ProductDTO;
import com.example.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProducts(@PathVariable("id")Long id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    //curl -X POST "http://localhost:8080/api/products" -H "Content-Type: application/json" -d "{\"name\": \"Laptop\", \"price\": 1200.50}"
    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.createProduct(productDTO));
    }

    //curl -X PUT "http://localhost:8080/api/products/4" -H "Content-Type: application/json" -d "{\"name\": \"Updated Laptop\", \"price\": 1300.00}"
    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable("id")Long id,@RequestBody ProductDTO productDTO){
        return ResponseEntity.ok(productService.updateProduct(productDTO));
    }

    //curl -X DELETE "http://localhost:8080/api/products/4"
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id")Long id){
        productService.deleteProduct(id);
        return ResponseEntity.ok().body(id+"번 상품이 삭제되었습니다.");
    }
}
