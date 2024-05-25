package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Provincia;
import com.labIv.backend_elBuenSabor.services.impl.ProvinciaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "provincias")
public class ProvinciaController extends GenericControllerImpl<Provincia, ProvinciaServiceImpl> {

    public ProvinciaController(ProvinciaServiceImpl servicio) {
        super(servicio);
    }
}
