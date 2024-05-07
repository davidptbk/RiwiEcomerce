package com.riwi.riwi_ecomerce.domain.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "riwi_coin")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RiwiCoinEntity {
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private BigDecimal exchangeRate;
}
