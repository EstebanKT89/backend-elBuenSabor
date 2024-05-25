package com.labIv.backend_elBuenSabor.entities;

import lombok.*;

import jakarta.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Entity
public class ImagenPersona extends GenericEntity{

    private String url;
}
