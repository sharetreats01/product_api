package com.sharetreats01.sharetreats_product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    private Long brand;
    private Long productType;
    private String name;
    private String imageURL;
    private int price;
    private String description;
}
