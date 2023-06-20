package com.sharetreats01.sharetreats_product.repository;

import com.sharetreats01.sharetreats_product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByBrand_IdAndProductType_Id(Long brandId, Long productTypeId);
}
