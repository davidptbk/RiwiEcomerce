package com.riwi.riwi_ecomerce.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

public class PurchaseRequest {
    @FutureOrPresent(message = "La fecha y hora debe ser futura")
    @NotNull(message = "La fecha y hora de la compra es requerida")
    private LocalDateTime dateTime;
    @NotNull(message = "El id del usuario es obligatorio")
    private String user_id;
    
}
