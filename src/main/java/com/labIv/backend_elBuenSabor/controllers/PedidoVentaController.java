package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.PedidoVenta;
import com.labIv.backend_elBuenSabor.services.impl.PedidoVentaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "pedidosVentas")
public class PedidoVentaController extends GenericControllerImpl<PedidoVenta, PedidoVentaServiceImpl> {

    public PedidoVentaController(PedidoVentaServiceImpl servicio) {
        super(servicio);
    }
}
