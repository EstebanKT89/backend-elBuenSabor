package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.UnidadMedida;
import com.labIv.backend_elBuenSabor.services.impl.UnidadMedidaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "unidadesMedidas")
public class UnidadMedidaController extends GenericControllerImpl<UnidadMedida, UnidadMedidaServiceImpl> {

    public UnidadMedidaController(UnidadMedidaServiceImpl servicio) {
        super(servicio);
    }
}
