package com.riwi.riwi_ecomerce.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.riwi_ecomerce.api.dto.request.ProductRequest;
import com.riwi.riwi_ecomerce.api.dto.response.ProductResponse;
import com.riwi.riwi_ecomerce.domain.entities.ProductEntity;
import com.riwi.riwi_ecomerce.domain.repositories.ProductRepository;
import com.riwi.riwi_ecomerce.infrastructure.abstract_services.IProductService;
import com.riwi.riwi_ecomerce.util.enums.SortType;
import com.riwi.riwi_ecomerce.util.mappers.ProductMapper;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Service
@AllArgsConstructor
@Builder
public class ProductService implements IProductService {
    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    private final ProductMapper productMapper;

    @Override
    public ProductResponse create(ProductRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ProductResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public ProductResponse update(ProductRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<ProductResponse> getAll(int page, int size, SortType sort) {
        // TODO Auto-generated method stub

        this.productRepository.findAll().map(i ->  this.productMapper.entityToResponse(i))
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    private ProductResponse entityToResponse (ProductEntity entity){
        return ProductResponse.builder()
        .id(entity.getId())
        .name(entity.getName())
        .price(entity.getPrice())
        .features(entity.getFeatures())
        .stock(entity.getStock())
        .purchase(entity.getPurchases()) // La lista no es un tipo de dato que se pueda adjuntar aqui 
        .build();
        


    }

}
