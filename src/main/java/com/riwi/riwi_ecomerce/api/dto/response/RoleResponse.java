package com.riwi.riwi_ecomerce.api.dto.response;

import java.util.List;

import com.riwi.riwi_ecomerce.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponse {
    
    private Long id;
    private String name;
    //private List<UserToRoleResponse> users; //TODO crear esta entidad o/y un BasicResponse para cada uno

}
