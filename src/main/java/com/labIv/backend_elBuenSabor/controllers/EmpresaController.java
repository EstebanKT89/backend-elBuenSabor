package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Empresa;
import com.labIv.backend_elBuenSabor.services.impl.EmpresaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "empresas")
public class EmpresaController extends GenericControllerImpl<Empresa, EmpresaServiceImpl> {

    public EmpresaController(EmpresaServiceImpl servicio) {
        super(servicio);
    }
}
