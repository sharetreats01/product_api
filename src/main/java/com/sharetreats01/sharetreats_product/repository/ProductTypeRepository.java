package com.sharetreats01.sharetreats_product.repository;

import com.sharetreats01.sharetreats_product.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
    ProductType findAllById(Long Id);
}
