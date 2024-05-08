package com.riwi.riwi_ecomerce.infrastructure.abstract_services;

import com.riwi.riwi_ecomerce.api.dto.request.UserRequest;
import com.riwi.riwi_ecomerce.api.dto.response.UserResponse;

public interface IUserService extends CrudService<UserRequest, UserResponse, String>{
    
    public final String FIELD_BY_SORT = "name";
}
