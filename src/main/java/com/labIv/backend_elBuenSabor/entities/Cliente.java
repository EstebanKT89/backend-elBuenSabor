package com.labIv.backend_elBuenSabor.entities;

import lombok.*;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Cliente extends Persona{

    @Builder.Default
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PedidoVenta> pedidos = new HashSet<>();

}
