package com.riwi.riwi_ecomerce.api.dto.response;

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
public class PurchaseToUserResponse {
    //Esta clase es para que al usuario se le listen las compras sin que se cree un bucle
    private Long id;
    private List<ShoppingCart> products;
}
