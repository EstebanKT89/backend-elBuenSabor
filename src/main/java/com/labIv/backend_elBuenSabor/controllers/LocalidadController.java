package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Localidad;
import com.labIv.backend_elBuenSabor.services.impl.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "localidades")
public class LocalidadController extends GenericControllerImpl<Localidad, LocalidadServiceImpl> {

    public LocalidadController(LocalidadServiceImpl servicio) {
        super(servicio);
    }
}
