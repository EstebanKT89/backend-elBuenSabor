package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.PedidoVentaDetalle;
import com.labIv.backend_elBuenSabor.services.impl.PedidoVentaDetalleServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "pedidosVentasDetalles")
public class PedidoVentaDetalleController extends GenericControllerImpl<PedidoVentaDetalle, PedidoVentaDetalleServiceImpl> {

    public PedidoVentaDetalleController(PedidoVentaDetalleServiceImpl servicio) {
        super(servicio);
    }
}
