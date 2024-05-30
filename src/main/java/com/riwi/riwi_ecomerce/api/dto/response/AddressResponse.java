package com.riwi.riwi_ecomerce.api.dto.response;

import com.riwi.riwi_ecomerce.domain.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    
    private Long id;
    private String street;
    private String number;
    private String neigborhood;
    //private UserToAddressResponse user; //TODO BasicResponse OR UserToAddressResponse

}
