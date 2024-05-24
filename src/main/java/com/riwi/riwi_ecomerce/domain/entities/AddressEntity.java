package com.riwi.riwi_ecomerce.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "adress")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String IdUser;

    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String number;
    @Column(nullable = false)
    private String neigborhood;
}
