package com.riwi.riwi_ecomerce.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.riwi_ecomerce.domain.entities.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    
}
