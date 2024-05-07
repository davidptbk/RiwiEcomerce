package com.riwi_ecomerce.riwi_ecomerce.domain.entities;

import com.riwi_ecomerce.riwi_ecomerce.util.enums.RoleUser;
import com.riwi_ecomerce.riwi_ecomerce.util.enums.StatusUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String name;
    private String lastName;
    @Column(nullable = false)
    private String email;
    private String phone;
    private String riwiPoints;
    @Enumerated(EnumType.STRING)
    private RoleUser role;
    @Enumerated(EnumType.STRING)
    private StatusUser status;
}
