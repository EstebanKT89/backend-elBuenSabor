package com.labIv.backend_elBuenSabor.entities;

import lombok.*;

import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class PedidoVentaDetalle extends GenericEntity{

    private Integer cantidad;
    private Double subTotal;

    @ManyToOne
    private Articulo articulo;
}
