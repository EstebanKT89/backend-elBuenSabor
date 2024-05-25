package com.labIv.backend_elBuenSabor.entities;

import com.labIv.backend_elBuenSabor.enums.TipoPromocion;
import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Promocion extends GenericEntity {

    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;


    @Builder.Default
    @JoinTable(name = "promocion_articulo", joinColumns = @JoinColumn(name = "promocion_id"), inverseJoinColumns = @JoinColumn(name = "articulo_id"))
    @ManyToMany
    private List<Articulo> articulos = new ArrayList<>();


    @Builder.Default
    @JoinColumn(name = "promocion_id")
    @OneToMany
    private Set<ImagenArticulo> imagenes = new HashSet<>();


    @ManyToMany(mappedBy = "promociones")
    private Set<Sucursal> sucursales = new HashSet<>();


    @Builder.Default
    @JoinColumn(name = "promocion_id")
    @OneToMany
    private Set<PromocionDetalle> detalles = new HashSet<>();
}
