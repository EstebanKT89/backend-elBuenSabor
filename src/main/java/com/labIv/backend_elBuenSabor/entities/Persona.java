package com.labIv.backend_elBuenSabor.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona extends GenericEntity {

    private String nombre;
    private String apellido;
    private String telefono;

    @Column(unique = true)
    private String email;

    @OneToOne
    private Usuario usuario;

    @OneToOne
    protected ImagenPersona imagenPersona;


    @Builder.Default
    @JoinTable(name = "cliente_domicilio", joinColumns = @JoinColumn(name = "cliente_id"), inverseJoinColumns = @JoinColumn(name = "domicilio_id"))
    @ManyToMany
    protected Set<Domicilio> domicilios = new HashSet<>();

}
