package com.sharetreats01.sharetreats_product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class ProductType {
    @Id
    private Long id;

    @Column
    private String name;
}
