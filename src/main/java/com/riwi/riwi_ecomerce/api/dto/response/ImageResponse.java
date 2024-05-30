package com.riwi.riwi_ecomerce.api.dto.response;

import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageResponse {

    private Long id;
    private String URL;
    //private ProductToImageResponse product; //TODO

}
