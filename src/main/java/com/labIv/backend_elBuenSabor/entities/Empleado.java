package com.labIv.backend_elBuenSabor.entities;

import com.labIv.backend_elBuenSabor.enums.Rol;
import lombok.*;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Empleado extends Persona{

    private Rol tipoEmpleado;


    @Builder.Default
    @ToString.Exclude
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.REFRESH, orphanRemoval = true)
    private Set<PedidoVenta> pedidos= new HashSet<>();


    @ToString.Exclude
    @JoinColumn(name = "sucursal_id")
    @ManyToOne
    private Sucursal sucursal;
}
