package com.sharetreats01.sharetreats_product.controller;

import com.sharetreats01.sharetreats_product.dto.ProductRequestDto;
import com.sharetreats01.sharetreats_product.dto.ProductResponseDto;
import com.sharetreats01.sharetreats_product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;

    @PostMapping("/api/product")
    public ResponseEntity<String> createPost(@RequestBody ProductRequestDto productRequestDto) {
        productService.saveProduct(productRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("제품 저장 완료");
    }

    @GetMapping("/api/chatbot")
    public ResponseEntity<ProductResponseDto> getProductList(
            @RequestParam("brandId") Long brandId,
            @RequestParam("productType") Long productType) {

        ProductResponseDto ProductList = productService.getProductList(brandId, productType);
        return ResponseEntity.status(HttpStatus.OK).body(ProductList);
    }
}
