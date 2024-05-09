package com.riwi.riwi_ecomerce.api.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import com.riwi.riwi_ecomerce.domain.entities.ProductToPurchase;
import com.riwi.riwi_ecomerce.domain.entities.ShoppingCart;
import com.riwi.riwi_ecomerce.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseResponse {
    private Long id;
    private LocalDateTime dateTime;
    private UserEntity user;
    private List<ShoppingCart> products;
    private List<ProductToPurchase> purchases;
}
