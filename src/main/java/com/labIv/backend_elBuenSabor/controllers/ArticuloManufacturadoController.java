package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.ArticuloManufacturado;
import com.labIv.backend_elBuenSabor.services.impl.ArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "articulosManufacturados")
public class ArticuloManufacturadoController extends GenericControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {

    public ArticuloManufacturadoController(ArticuloManufacturadoServiceImpl servicio) {
        super(servicio);
    }
}
