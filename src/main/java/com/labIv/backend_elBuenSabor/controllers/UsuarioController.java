package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Usuario;
import com.labIv.backend_elBuenSabor.services.impl.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "usuarios")
public class UsuarioController extends GenericControllerImpl<Usuario, UsuarioServiceImpl> {

    public UsuarioController(UsuarioServiceImpl servicio) {
        super(servicio);
    }
}
