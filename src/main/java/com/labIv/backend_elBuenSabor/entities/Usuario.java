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
public class Usuario extends GenericEntity{

    @Column(unique=true)
    private String auth0Id;
    @Column(unique=true)
    private String username;

}
