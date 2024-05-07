package com.riwiEcomerce.riwiEcomerce.domain.repositories;

import java.math.BigDecimal;

import jakarta.persistence.Entity;

@Entity(name = "product")
public class ProductEntity {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    

}
