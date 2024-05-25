package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Sucursal;
import com.labIv.backend_elBuenSabor.services.impl.SucursalServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "sucursales")
public class SucursalController extends GenericControllerImpl<Sucursal, SucursalServiceImpl> {

    public SucursalController(SucursalServiceImpl servicio) {
        super(servicio);
    }
}