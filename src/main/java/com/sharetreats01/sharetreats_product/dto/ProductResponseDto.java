package com.sharetreats01.sharetreats_product.dto;

import com.sharetreats01.sharetreats_product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {
    private List<Product> productList;
}
