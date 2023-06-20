package com.sharetreats01.sharetreats_product.repository;

import com.sharetreats01.sharetreats_product.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    Brand findAllById(Long Id);
}
