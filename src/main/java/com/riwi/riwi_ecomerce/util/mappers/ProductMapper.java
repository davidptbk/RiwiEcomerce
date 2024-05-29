package com.riwi.riwi_ecomerce.util.mappers;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.riwi.riwi_ecomerce.api.dto.response.ProductResponse;
import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ProductMapper {

    private final PurshaseMapper purshaseMapper;


    public ProductResponse entityToResponse(ProductEntity entity) {

        var pr = entity.getPurchases()
        .stream()
        .map(temp -> this.purshaseMapper.entityToResponse(temp))
        .collect(Collectors.toList());


        return ProductResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .features(entity.getFeatures())
                .stock(entity.getStock())
                .purchase(pr) // La lista no es un tipo de dato que se pueda adjuntar aqui
                .build();

    }
}
