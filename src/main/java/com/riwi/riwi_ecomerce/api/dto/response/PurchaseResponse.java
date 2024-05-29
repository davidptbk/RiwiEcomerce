package com.riwi.riwi_ecomerce.api.dto.response;

import java.time.LocalDateTime;

import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;
import com.riwi.riwi_ecomerce.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseResponse {
    public Long id;
    private Integer quantityItems;
    private Float individualTotalValue;
    private Float totalValue;
    private Boolean status;
     private LocalDateTime date;
     private Long ref;
     private ProductResponse product;
     private UserEntity user; //TODO Cambiar a Response control-shift para buscar todos los todos
}
