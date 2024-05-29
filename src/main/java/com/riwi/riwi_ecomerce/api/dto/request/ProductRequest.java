package com.riwi.riwi_ecomerce.api.dto.request;

import java.util.List;

import com.riwi.riwi_ecomerce.domain.entities.ImageEntity;
import com.riwi.riwi_ecomerce.domain.entities.PurchaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Mirar bien 
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private Float price;
    private String features;
    private Integer stock;
    private Long idPurchases;
}
