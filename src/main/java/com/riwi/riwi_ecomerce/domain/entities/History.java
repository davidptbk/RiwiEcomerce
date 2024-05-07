package com.riwi.riwi_ecomerce.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "history")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class History {
    private Long id;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
        fetch = FetchType.EAGER,
        mappedBy = "history",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Purchase> purchases;
}
