package com.sharetreats01.sharetreats_product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
public class Product {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType productType;

    @Column
    private String name;

    @Column(name ="image_url")
    private String imageURL;

    @Column
    private int price;

    @Column
    private String description;
}
