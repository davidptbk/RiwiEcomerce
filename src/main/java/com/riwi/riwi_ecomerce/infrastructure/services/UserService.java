package com.riwi.riwi_ecomerce.infrastructure.services;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.riwi_ecomerce.api.dto.request.UserRequest;
import com.riwi.riwi_ecomerce.api.dto.response.PurchaseToUserResponse;
import com.riwi.riwi_ecomerce.api.dto.response.UserResponse;
import com.riwi.riwi_ecomerce.domain.entities.Purchase;
import com.riwi.riwi_ecomerce.domain.entities.UserEntity;
import com.riwi.riwi_ecomerce.domain.repositories.UserRepository;
import com.riwi.riwi_ecomerce.infrastructure.abstract_services.IUserService;
import com.riwi.riwi_ecomerce.util.enums.SortType;
import com.riwi.riwi_ecomerce.util.exceptions.IdNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    @Autowired
    private final UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest request) {
        UserEntity user = this.requestToUser(request, new UserEntity());

        return this.entityToResponse(this.userRepository.save(user));
    }

    @Override
    public UserResponse get(String id) {
        return this.entityToResponse(this.find(id));
    }

    @Override
    public UserResponse update(UserRequest request, String id) {

        UserEntity user = this.find(id);

        UserEntity userUpdate = this.requestToUser(request, user);

        return this.entityToResponse(this.userRepository.save(userUpdate));
    }

    @Override
    public void delete(String id) {

        UserEntity user = this.find(id);

        //Elimino
        this.userRepository.delete(user);
    }

    @Override
    public Page<UserResponse> getAll(int page, int size, SortType sort) {
        if (page < 0) {
            page = 0;
        }

        //Falta Organizar el sort que es la organizacion es ASC o DESC
        PageRequest pagination = PageRequest.of(page, size);
        return this.userRepository.findAll(pagination).map(user -> this.entityToResponse(user));
    }
    


    private UserEntity find(String id){
        return this.userRepository.findById(id).orElseThrow(() -> new IdNotFoundException("User"));
    }

    private UserResponse entityToResponse(UserEntity entity){
        UserResponse response = new UserResponse();

        BeanUtils.copyProperties(entity, response);
        
        response.setPurchases(entity.getPurchases().stream().map(purchase -> this.purchaseToResponse(purchase)).collect(Collectors.toList()));
        return response;
    }

    private PurchaseToUserResponse purchaseToResponse(Purchase entity){
        PurchaseToUserResponse response = new PurchaseToUserResponse();
        BeanUtils.copyProperties(entity, response);

        return response;
    }

    private UserEntity requestToUser(UserRequest request, UserEntity company){
        //Hacemos la copia
        BeanUtils.copyProperties(request, company);

        //PARA QUE EL ARRAY SALGA VACIO AL CREARCE LA COMPANY HACEMOS:
        company.setPurchases(new ArrayList<>());

        return company;
    }
}
