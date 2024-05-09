package com.riwi.riwi_ecomerce.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @Size(min = 3, max = 100, message = "El/los nombre/s deben de estar entre la cantidad de caracteres permitidos(3 - 100)")
    @NotBlank(message = "El nombre de el usuario es requerido")
    private String name;

    @Size(min = 2, max = 100, message = "El/los apellido/s deben de estar entre la cantidad de caracteres permitidos(2 - 100)")
    private String lastName;

    @Size(min = 9, max = 100, message = "El email debe de estar entre la cantidad de caracteres permitidos(9 - 100)")
    @Email(message = "Ingrese un formato de email válido; EJEMPLO: example@gmail.com .")
    private String email;

    @Pattern(regexp = "^[+]?[0-9]{10,15}$", message = "El formato del número de teléfono no es válido. Debe comenzar opcionalmente con un '+', seguido de 10 a 15 dígitos.")
    private String phone;

    @NotBlank(message = "la direccion de entrega es requerido")
    private String address;

}
