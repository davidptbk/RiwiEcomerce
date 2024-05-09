package com.riwi.riwi_ecomerce.infrastructure.abstract_services;

import com.riwi.riwi_ecomerce.api.dto.request.CategoryRequest;
import com.riwi.riwi_ecomerce.api.dto.response.CategoryResponse;

public interface ICategoryService extends CrudService<CategoryRequest, CategoryResponse, Long> {
    public final String FIELD_BY_SORT = "name";
}
