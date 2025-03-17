package com.example.product.service;

import com.example.product.domain.Product;
import com.example.product.dto.ProductDTO;
import com.example.product.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //모든 상품 조회
    @Transactional(readOnly = true)
    public List<ProductDTO> getProducts(){
        return productRepository.findAll().stream()
                .map(ProductDTO::fromEntity)
                .collect(Collectors.toList());
    }

    //특정 상품 조회
    @Transactional
    public ProductDTO getProductById(Long id){
        Product product = productRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException("id에 해당하는 product를 찾을 수 없습니다."+id));
        return ProductDTO.fromEntity(product);
    }

    //상품 추가
    //#1. Entity 에서 바로 처리 방식
    @Transactional
    public Product addProduct(String name, double price){
        return productRepository.save(new Product(name, price));
    }

    //#2. Entity -> DTO 로 옮겨 담아서 처리 방식
    @Transactional
    public ProductDTO createProduct(ProductDTO productDTO){
        //DTO를 Entity로 변환
        //방법 1 (항목이 작으면 한줄 코딩)
        //Product product = new Product(null, productDTO.getName(), productDTO.getPrice());

        //방법 2 (항목이 많으면 개별적으로 set - 권장)
//        Product product = new Product();
//        product.setName(productDTO.getName());
//        product.setPrice(productDTO.getPrice());
//
//        Product createProduct = productRepository.save(product);
//        productDTO.setId(createProduct.getId());
//        return productDTO;

        //방법 3 (빌더를 이용한 DTO 호출)
        Product product = Product.fromDTO(productDTO);
        Product createProduct = productRepository.save(product);

        return ProductDTO.fromEntity(createProduct);
    }

    //상품 수정
    @Transactional
    public ProductDTO updateProduct(ProductDTO productDTO){
        Product product = productRepository.findById(productDTO.getId())
                .orElseThrow(()->new EntityNotFoundException("업데이트 할 상품이 없음: "+productDTO.getId()));

//        Optional.ofNullable(productDTO.getName()).ifPresent(product::setName);
//
//        if(productDTO.getName() != null){
//            product.setName(productDTO.getName());
//        }
        product.setName(productDTO.getName());
        product.setPrice(product.getPrice());

        //double 에 값이 없으면 초기값 0.0 일테니 아래와 같이 if 문 처리하면 실제 0.0 인 정보도 포함될 수 있으므로 Optional 로 처리해야 함.
//        if(productDTO.getPrice() != 0.0){    //double --> double 의 차이점. 0.0
//            product.setPrice(productDTO.getPrice());
//        }
        //price 가 null 이면 수행하도록..
        return ProductDTO.fromEntity(product);
    }

    //상품 삭제
    @Transactional
    public void deleteProduct(Long id){
        if(!productRepository.existsById(id)){
            throw new RuntimeException("id에 해당하는 product가 존재하지 않습니다.:"+id);
        }
        productRepository.deleteById(id);
    }
}
