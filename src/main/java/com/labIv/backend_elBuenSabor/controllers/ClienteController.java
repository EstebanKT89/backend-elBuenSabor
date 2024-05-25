package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.Cliente;
import com.labIv.backend_elBuenSabor.services.impl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "clientes")
public class ClienteController extends GenericControllerImpl<Cliente, ClienteServiceImpl> {

    public ClienteController(ClienteServiceImpl servicio) {
        super(servicio);
    }
}
