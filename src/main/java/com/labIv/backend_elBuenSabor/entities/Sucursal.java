package com.labIv.backend_elBuenSabor.entities;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Sucursal extends GenericEntity {

    private String nombre;
    private LocalDateTime horarioApertura;
    private LocalDateTime horarioCierre;

    @OneToOne
    private Domicilio domicilio;


    @Builder.Default
    @ToString.Exclude
    @JoinTable(name = "sucursal_categoria", joinColumns = @JoinColumn(name = "sucursal_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private Set<Categoria> categorias = new HashSet<>();


    @Builder.Default
    @ToString.Exclude
    @JoinTable(name = "sucursal_promocion", joinColumns = @JoinColumn(name = "promocion_id"), inverseJoinColumns = @JoinColumn(name = "sucursal_id"))
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Set<Promocion> promociones = new HashSet<>();


    @Builder.Default
    @OneToMany(mappedBy = "sucursal",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    private Set<Empleado> empleados = new HashSet<>();


    @ManyToOne
    private Empresa empresa;

}
