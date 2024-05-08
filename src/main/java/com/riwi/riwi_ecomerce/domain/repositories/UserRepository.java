package com.riwi.riwi_ecomerce.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.riwi_ecomerce.domain.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{
    //Hacer aca las demas consultas que vayamos a hacer en User
}
