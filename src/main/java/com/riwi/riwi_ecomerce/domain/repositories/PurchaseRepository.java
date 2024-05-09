package com.riwi.riwi_ecomerce.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.riwi_ecomerce.domain.entities.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    
}
