package com.riwi.riwi_ecomerce.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductToShoppingRequest {
    private Long productId;
    private Integer quantity;
}
