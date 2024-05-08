package com.riwi.riwi_ecomerce.api.dto.response;

import java.util.List;

import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartToUserResponse {
    //Purchase trae el Shopping Cart y este trae el usuario de nueva, asi que esta clase es para que la use el PurchaseToUserResponse
    private Long id;
    private List<ProductEntity> products;

}
