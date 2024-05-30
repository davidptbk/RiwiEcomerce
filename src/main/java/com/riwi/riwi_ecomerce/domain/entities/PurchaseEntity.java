package com.riwi.riwi_ecomerce.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "purchase")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Integer quantityItems;
    
    @Column(nullable = false)
    private Float individualTotalValue;
    
    @Column(nullable = false)
    private Float totalValue;
    
    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false)
    private LocalDateTime date;

    @Column(nullable = false)
    private Long ref;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_id", referencedColumnName = "id")
    private ProductEntity product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;
    
}