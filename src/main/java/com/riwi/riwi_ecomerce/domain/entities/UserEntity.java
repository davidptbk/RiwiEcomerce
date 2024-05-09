package com.riwi.riwi_ecomerce.domain.entities;

import java.util.List;

import com.riwi.riwi_ecomerce.util.enums.RoleUser;
import com.riwi.riwi_ecomerce.util.enums.StatusUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    private String lastName;

    @Column(nullable = false)
    private String email;

    private String phone;

    private String riwiPoints;
    
    @Column(nullable = false)
    private String address;

    @Enumerated(EnumType.STRING)
    private RoleUser role;

    @Enumerated(EnumType.STRING)
    private StatusUser status;

    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "user",
        cascade = CascadeType.ALL,
        orphanRemoval = false  )
        
        private List<Purchase> purchases;
}
