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
    private String phoneNumber;
    private String email;
    private RoleResponse role;
    private String riwiCoins;
    private StatusUser status;
    //private List<AdressToUserResponse> address; //TODO: Crear esto ya que la entidad de adress tiene el user por dentro, evitar blucle
    //private List<PurchaseToUserResponse> purchases; //TODO: Crear purchase to user response para que no se cree bucle
}
