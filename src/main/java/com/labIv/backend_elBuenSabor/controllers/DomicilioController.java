package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Domicilio;
import com.labIv.backend_elBuenSabor.services.impl.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "domicilios")
public class DomicilioController extends GenericControllerImpl<Domicilio, DomicilioServiceImpl> {

    public DomicilioController(DomicilioServiceImpl servicio) {
        super(servicio);
    }
}
