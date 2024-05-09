package com.riwi.riwi_ecomerce.api.controllers;

import java.util.Objects;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.riwi_ecomerce.api.dto.request.UserRequest;
import com.riwi.riwi_ecomerce.api.dto.response.UserResponse;
import com.riwi.riwi_ecomerce.infrastructure.abstract_services.IUserService;
import com.riwi.riwi_ecomerce.util.enums.SortType;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UserController {
    
    private final IUserService user;

    @GetMapping
    public ResponseEntity<Page<UserResponse>> getAll(
        @RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "5") int size,
        @RequestHeader(required = false) SortType sortType
    ){
        if (Objects.isNull(sortType)) sortType = SortType.NONE;

        return ResponseEntity.ok(this.user.getAll(page - 1, size, sortType));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserResponse> get(@PathVariable String id){
        return ResponseEntity.ok(this.user.get(id));
    }

    @PostMapping
    public ResponseEntity<UserResponse> insert(@Validated @RequestBody UserRequest request){
        return ResponseEntity.ok(this.user.create(request));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<UserResponse> delete(@PathVariable String id){
        this.user.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    private ResponseEntity<UserResponse> update(@Validated @RequestBody UserRequest request, @PathVariable String id){
        return ResponseEntity.ok(this.user.update(request, id));
    }
}
