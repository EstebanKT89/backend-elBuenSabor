package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Pais;
import com.labIv.backend_elBuenSabor.services.impl.PaisServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "paises")
public class PaisController extends GenericControllerImpl<Pais, PaisServiceImpl> {

    public PaisController(PaisServiceImpl servicio) {
        super(servicio);
    }
}
