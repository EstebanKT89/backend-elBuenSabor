package com.labIv.backend_elBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Articulo extends GenericEntity{

    protected String denominacion;
    protected Double precioVenta;


    @Builder.Default
    @ManyToMany(mappedBy = "articulos")
    protected Set<Promocion> estaEnPromociones = new HashSet<>();


    @Builder.Default
    @OneToMany
    @JoinColumn(name = "articulo_id")
    protected Set<ImagenArticulo> imagenes = new HashSet<>();


    @ManyToOne
    private UnidadMedida unidadMedida;

}
