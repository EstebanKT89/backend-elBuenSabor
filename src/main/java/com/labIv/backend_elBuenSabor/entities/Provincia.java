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
public class Provincia extends GenericEntity{

    private String nombre;

    @ManyToOne
    private Pais pais;
}
