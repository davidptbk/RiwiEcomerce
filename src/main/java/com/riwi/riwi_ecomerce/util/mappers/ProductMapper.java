package com.riwi.riwi_ecomerce.util.mappers;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.riwi.riwi_ecomerce.api.dto.response.ProductResponse;
import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ProductMapper {

    private final PurchaseMapper purchaseMapper;

    public ProductResponse entityToResponse(ProductEntity entity) {

        return ProductResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .features(entity.getFeatures())
                .stock(entity.getStock())
                .images(entity.getImages()) // La lista no es un tipo de dato que se pueda adjuntar aqui
                .build();
    }
}
