package com.riwi.riwi_ecomerce.infrastructure.abstract_services;

import com.riwi.riwi_ecomerce.api.dto.request.ProductRequest;
import com.riwi.riwi_ecomerce.api.dto.response.ProductResponse;
import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;

public interface IProductService extends CrudService<ProductRequest, ProductResponse, Long> {
    public final String FIELD_BY_SORT = "price";
}
