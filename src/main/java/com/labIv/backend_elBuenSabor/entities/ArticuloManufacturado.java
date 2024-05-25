package com.labIv.backend_elBuenSabor.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@Entity
public class ArticuloManufacturado extends Articulo{

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;


    @Builder.Default
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "articuloManufacturado_id")
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

}
