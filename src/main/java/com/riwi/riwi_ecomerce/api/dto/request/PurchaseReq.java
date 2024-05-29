package com.riwi.riwi_ecomerce.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseReq {
    @NotNull(message = "La cantidad de productos es requerida")
    private Integer quantityItems;
    @NotNull(message = "El valor individual es requerido")
    private Float individualTotalValue;
    @NotNull(message = "El valor total es requerido")
    private Float totalValue;
    @NotNull(message = "El estado de la compra es requerido")
    private Boolean status;
    //no se que va
    private LocalDateTime date;
    @NotNull(message = "La referencia es requerida")
    private Long ref;
    @NotNull(message = "El id del producto es requerido")
    private Long productId;
    @NotBlank(message = "El id del usuario es requerido")
    private String userId;
}
