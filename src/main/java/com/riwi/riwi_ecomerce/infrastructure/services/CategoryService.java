package com.riwi.riwi_ecomerce.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.riwi.riwi_ecomerce.api.dto.request.CategoryRequest;
import com.riwi.riwi_ecomerce.api.dto.response.CategoryResponse;
import com.riwi.riwi_ecomerce.domain.repositories.CategoryRepository;
import com.riwi.riwi_ecomerce.infrastructure.abstract_services.ICategoryService;
import com.riwi.riwi_ecomerce.util.enums.SortType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CategoryService implements ICategoryService {
    
    @Autowired
    private final CategoryRepository categoryRepository;

    @Override
    public CategoryResponse create(CategoryRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CategoryResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public CategoryResponse update(CategoryRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<CategoryResponse> getAll(int page, int size, SortType sort) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}
