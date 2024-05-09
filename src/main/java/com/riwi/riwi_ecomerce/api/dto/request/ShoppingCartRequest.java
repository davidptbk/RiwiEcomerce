package com.riwi.riwi_ecomerce.api.dto.request;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartRequest {
    @NotBlank(message = "El id del usuario es requerido")
    private String userId;

    @NotBlank(message = "Debe contener al menos un producto")
    private List<ProductToShoppingRequest> products;
}
