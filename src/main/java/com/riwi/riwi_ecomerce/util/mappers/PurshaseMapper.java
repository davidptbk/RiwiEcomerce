package com.riwi.riwi_ecomerce.util.mappers;

import org.springframework.stereotype.Component;

import com.riwi.riwi_ecomerce.api.dto.response.PurchaseResponse;
import com.riwi.riwi_ecomerce.domain.entities.PurchaseEntity;

@Component

public class PurshaseMapper {
      public PurchaseResponse entityToResponse(PurchaseEntity entity) {
        return PurchaseResponse.builder()
                .id(entity.getId())
                .quantityItems(entity.getQuantityItems())


                //'TODO' Terminar builder
                .build();

    }
}
