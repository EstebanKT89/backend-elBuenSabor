package com.labIv.backend_elBuenSabor.entities;

import lombok.*;

import jakarta.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class PromocionDetalle extends GenericEntity{

    private String detalle;
}
