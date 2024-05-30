package com.riwi.riwi_ecomerce.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
    @NotBlank(message = "La calle de la direccion es requerida")
    private String street;
    @NotBlank(message = "El numero de la direccion es requerido")
    private String number;
    @NotBlank(message = "EL barrio es requerido")
    private String neigborhood;
    @NotBlank(message = "El id del usuario es requerido")
    private String userId;
}
