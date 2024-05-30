package com.riwi.riwi_ecomerce.api.dto.request;

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
public class ImageRequest {
    @NotBlank(message = "La url de la imagen es requerida")
    private String URL;
    @NotNull(message = "El id del producto es requerido")
    private Long productId;
}
