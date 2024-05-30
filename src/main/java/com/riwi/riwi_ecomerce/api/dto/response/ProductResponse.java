package com.riwi.riwi_ecomerce.api.dto.response;

import java.util.List;

import com.riwi.riwi_ecomerce.domain.entities.ImageEntity;
import com.riwi.riwi_ecomerce.domain.entities.PurchaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private Float price;
    private String features;
    private Integer stock;
    //private List<ImageResponse> images;
    private List<PurchaseResponse> purchases;
}
