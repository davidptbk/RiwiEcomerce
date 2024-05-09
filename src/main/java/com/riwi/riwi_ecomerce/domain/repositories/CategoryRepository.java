package com.riwi.riwi_ecomerce.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.riwi_ecomerce.domain.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    
}
