package com.riwi.riwi_ecomerce.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.riwi.riwi_ecomerce.api.dto.request.UserRequest;
import com.riwi.riwi_ecomerce.api.dto.response.UserResponse;
import com.riwi.riwi_ecomerce.domain.entities.UserEntity;
import com.riwi.riwi_ecomerce.domain.repositories.UserRepository;
import com.riwi.riwi_ecomerce.infrastructure.abstract_services.IUserService;
import com.riwi.riwi_ecomerce.util.enums.SortType;
import com.riwi.riwi_ecomerce.util.exceptions.BadRequestException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    @Autowired
    private final UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest request) {
        UserEntity user = this.requestToEntity(request);

        return this.entityToResponse(this.userRepository.save(user));
    }

    @Override
    public UserResponse get(String id) {
        return this.entityToResponse(this.find(id));
    }

    @Override
    public UserResponse update(UserRequest request, String id) {

        UserEntity user = this.find(id);

        user = this.requestToEntity(request);
        user.setId(id);

        return this.entityToResponse(this.userRepository.save(user));
    }

    @Override
    public void delete(String id) {

        this.userRepository.delete(this.find(id));
    }

    @Override
    public Page<UserResponse> getAll(int page, int size, SortType sort) {
        if (page < 0) {
            page = 0;
        }

        PageRequest pagination = null;

        switch (sort) {
            case NONE -> pagination = PageRequest.of(page, size);
        
            case ASC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).ascending());

            case DESC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).descending());
        }

        return this.userRepository.findAll(pagination).map(this::entityToResponse);
    }
    


    private UserEntity find(String id){
        return this.userRepository.findById(id).orElseThrow(() -> new BadRequestException("No hay registros en el ID suministrado"));
    }

    private UserResponse entityToResponse(UserEntity entity){
        return UserResponse.builder()
            .id(entity.getId())
            .name(entity.getName())
            .lastName(entity.getLastName())
            .email(entity.getEmail())
            .phone(entity.getPhone())
            .riwiPoints(entity.getRiwiPoints())
            .role(entity.getRole())
            .status(entity.getStatus())
            .build();
    }

    // private PurchaseToUserResponse purchaseToResponse(Purchase entity){
    //     PurchaseToUserResponse response = new PurchaseToUserResponse();
    //     BeanUtils.copyProperties(entity, response);

    //     return response;
    // }
        //esto es para la relacion 


    private UserEntity requestToEntity(UserRequest request){
        return UserEntity.builder()
        .name(request.getName())
        .lastName(request.getLastName())
        .email(request.getEmail())
        .phone(request.getPhone())
        .build();
    }
}
