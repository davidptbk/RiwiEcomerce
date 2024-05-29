package com.riwi.riwi_ecomerce.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
