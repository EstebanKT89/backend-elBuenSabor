package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.ArticuloInsumo;
import com.labIv.backend_elBuenSabor.services.impl.ArticuloInsumoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "articulosInsumos")
public class ArticuloInsumoController extends GenericControllerImpl<ArticuloInsumo, ArticuloInsumoServiceImpl> {


    public ArticuloInsumoController(ArticuloInsumoServiceImpl servicio) {
        super(servicio);
    }
}