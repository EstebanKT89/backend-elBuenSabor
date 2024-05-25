package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.ImagenPersona;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.ImagenPersonaService;
import org.springframework.stereotype.Service;

@Service
public class ImagenPersonaServiceImpl extends GenericServiceImpl<ImagenPersona,Long> implements ImagenPersonaService {

    public ImagenPersonaServiceImpl(GenericRepository<ImagenPersona, Long> genericRepository) {
        super(genericRepository);
    }
}
