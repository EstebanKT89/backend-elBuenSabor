package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.FacturaVenta;
import com.labIv.backend_elBuenSabor.services.impl.FacturaVentaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "facturasVentas")
public class FacturaVentaController extends GenericControllerImpl<FacturaVenta, FacturaVentaServiceImpl> {

    public FacturaVentaController(FacturaVentaServiceImpl servicio) {
        super(servicio);
    }


}

