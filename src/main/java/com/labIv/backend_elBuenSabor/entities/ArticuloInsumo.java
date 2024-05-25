package com.labIv.backend_elBuenSabor.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@Entity
public class ArticuloInsumo extends Articulo{

    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;


}
