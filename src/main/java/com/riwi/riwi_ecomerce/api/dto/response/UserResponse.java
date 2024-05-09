package com.riwi.riwi_ecomerce.api.dto.response;

import java.util.List;

import com.riwi.riwi_ecomerce.util.enums.RoleUser;
import com.riwi.riwi_ecomerce.util.enums.StatusUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String riwiPoints;
    private RoleUser role;
    private StatusUser status;
    private String address;
    private List<PurchaseToUserResponse> purchases;

}
