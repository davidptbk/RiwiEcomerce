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
public class RoleReq {
    @NotBlank(message = "El nombre del role es requerido")
    private String name;
    
}
