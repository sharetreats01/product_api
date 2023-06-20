package com.sharetreats01.sharetreats_product.service;

import com.sharetreats01.sharetreats_product.dto.ProductRequestDto;
import com.sharetreats01.sharetreats_product.dto.ProductResponseDto;
import com.sharetreats01.sharetreats_product.model.Brand;
import com.sharetreats01.sharetreats_product.model.Product;
import com.sharetreats01.sharetreats_product.model.ProductType;
import com.sharetreats01.sharetreats_product.repository.BrandRepository;
import com.sharetreats01.sharetreats_product.repository.ProductRepository;
import com.sharetreats01.sharetreats_product.repository.ProductTypeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductService {
    private final BrandRepository brandRepository;
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;

    public ProductResponseDto getProductList(Long brandId, Long productType) {
        List<Product> productList = productRepository.findAllByBrand_IdAndProductType_Id(brandId, productType);

        return ProductResponseDto.builder()
                .productList(productList)
                .build();
    }

    public void saveProduct(ProductRequestDto productRequestDto) {
        log.info("getProductType{} ", productRequestDto.getProductType());
        log.info("getImageURL{} ", productRequestDto.getImageURL());
        Brand brand = brandRepository.findAllById(productRequestDto.getBrand());
        ProductType productType = productTypeRepository.findAllById(productRequestDto.getProductType());

        Product product = Product.builder()
                .brand(brand)
                .productType(productType)
                .name(productRequestDto.getName())
                .imageURL(productRequestDto.getImageURL())
                .price(productRequestDto.getPrice())
                .description(productRequestDto.getDescription())
                .build();

        productRepository.save(product);
    }
}
