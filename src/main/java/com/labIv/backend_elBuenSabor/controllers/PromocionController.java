package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Promocion;
import com.labIv.backend_elBuenSabor.services.impl.PromocionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "promociones")
public class PromocionController extends GenericControllerImpl<Promocion, PromocionServiceImpl> {

    public PromocionController(PromocionServiceImpl servicio) {
        super(servicio);
    }
}
