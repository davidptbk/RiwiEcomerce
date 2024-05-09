package com.riwi.riwi_ecomerce.api.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
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
public class ProductRequest {
    @NotBlank(message = "El nombre del prodcuto es requerido")    
    private String name;
    private String description;
    @Min(value = 0, message = "El precio no puede ser menor a 0" )
    @NotNull(message = "El precio del producto es requqerido")
    private BigDecimal price;
    @NotBlank(message = "La imagen del producto es requerida")
    private String imageUrl;
    @Min(value = 0, message= "El sotck no puede ser menor a 0")
    @NotNull(message = "El stock del producto es requerido")
    private Integer stock;
    @NotNull(message = "EL id de la categoria es requqerido")
    @Min(value = 1, message = "El id de categoria debe ser mayor a cero")
    private Long categoryId;

}
