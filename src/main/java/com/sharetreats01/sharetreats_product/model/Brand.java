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
public class Brand {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name= "image_url")
    private String imageURL;

    @Column(name= "description")
    private String description;
}
