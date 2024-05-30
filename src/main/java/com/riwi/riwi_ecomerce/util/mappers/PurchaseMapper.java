package com.riwi.riwi_ecomerce.util.mappers;

import org.springframework.stereotype.Component;

import com.riwi.riwi_ecomerce.api.dto.response.PurchaseResponse;
import com.riwi.riwi_ecomerce.domain.entities.PurchaseEntity;

@Component

public class PurchaseMapper {

  private final ProductMapper productMapper;
  
      public PurchaseResponse entityToResponse(PurchaseEntity entity) {
        return PurchaseResponse.builder()
                .id(entity.getId())
                .quantityItems(entity.getQuantityItems())
                .individualTotalValue(entity.getIndividualTotalValue())
                .totalValue(entity.getTotalValue())
                .status(entity.getStatus())
                .date(entity.getDate())
                .ref(entity.getRef())
                .product(entity.getProducts)

                //'TODO' Terminar builder
                .build();

    }
}
