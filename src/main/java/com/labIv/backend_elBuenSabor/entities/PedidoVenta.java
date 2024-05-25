package com.labIv.backend_elBuenSabor.entities;

import com.labIv.backend_elBuenSabor.enums.Estado;
import com.labIv.backend_elBuenSabor.enums.FormaPago;
import com.labIv.backend_elBuenSabor.enums.TipoEnvio;
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
public class PedidoVenta extends GenericEntity {

    private LocalDateTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDateTime fechaPedido;

    @ManyToOne
    private Sucursal sucursal;

    @ManyToOne
    private Domicilio domicilio;

    @OneToOne
    private FacturaVenta facturaVenta;


    @JoinColumn(name = "cliente_id")
    @ManyToOne
    private Cliente cliente;


    @Builder.Default
    @JoinColumn(name = "pedido_id")
    @OneToMany(cascade = CascadeType.ALL)
    private Set<PedidoVentaDetalle> detallePedidos = new HashSet<>();



    @JoinColumn(name = "empleado_id")
    @ManyToOne
    private Empleado empleado;
}
