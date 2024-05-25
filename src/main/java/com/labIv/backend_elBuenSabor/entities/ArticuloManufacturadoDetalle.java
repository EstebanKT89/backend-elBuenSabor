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
public class ArticuloManufacturadoDetalle extends GenericEntity{

    private Integer cantidad;

    @ManyToOne
    private ArticuloInsumo articuloInsumo;

}
