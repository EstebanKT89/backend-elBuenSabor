package com.labIv.backend_elBuenSabor.entities;


import lombok.*;


import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Empresa extends GenericEntity{

    private String nombre;
    private String razonSocial;
    private Integer cuil;


    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    private Set<Sucursal> sucursales = new HashSet<>();

}
