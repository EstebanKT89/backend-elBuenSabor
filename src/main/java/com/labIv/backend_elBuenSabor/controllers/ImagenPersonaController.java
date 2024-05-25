package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.ImagenPersona;
import com.labIv.backend_elBuenSabor.services.impl.ImagenPersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path= "/api/imagenesPersonas")
public class ImagenPersonaController extends GenericControllerImpl<ImagenPersona, ImagenPersonaServiceImpl> {


        public ImagenPersonaController(ImagenPersonaServiceImpl servicio) {
            super(servicio);
        }

}
