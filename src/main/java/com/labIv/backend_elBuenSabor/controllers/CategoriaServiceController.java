package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Categoria;
import com.labIv.backend_elBuenSabor.services.impl.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "categorias")
public class CategoriaServiceController extends GenericControllerImpl<Categoria, CategoriaServiceImpl> {

    public CategoriaServiceController(CategoriaServiceImpl servicio) {
        super(servicio);
    }
}
