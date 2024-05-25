package com.labIv.backend_elBuenSabor.entities;

import lombok.*;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Categoria extends GenericEntity{

    private String denominacion;


    @Builder.Default
    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Set<Articulo> articulos = new HashSet<>();


    @Builder.Default
    @OneToMany
    @JoinColumn(name = "categoria_padre_id")
    private Set<Categoria> subCategorias = new HashSet<>();


    @Builder.Default
    @ManyToMany(mappedBy = "categorias")
    private Set<Sucursal> sucursales = new HashSet<>();
}
