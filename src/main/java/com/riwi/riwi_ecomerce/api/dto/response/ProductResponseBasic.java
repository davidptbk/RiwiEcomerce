package com.riwi.riwi_ecomerce.api.dto.response;

import java.math.BigDecimal;


import com.riwi.riwi_ecomerce.domain.entities.CategoryEntity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseBasic {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private Integer stock;
    private CategoryEntity category;
}
