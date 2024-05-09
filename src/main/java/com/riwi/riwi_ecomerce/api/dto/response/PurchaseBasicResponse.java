package com.riwi.riwi_ecomerce.api.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import com.riwi.riwi_ecomerce.domain.entities.ShoppingCart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseBasicResponse {
    private Long id;
    private LocalDateTime dateTime;
    private UserResponse user;
    private List<ShoppingCart> products;
}
