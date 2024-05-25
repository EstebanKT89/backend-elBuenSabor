package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.ImagenArticulo;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.ImagenArticuloService;
import org.springframework.stereotype.Service;

@Service
public class ImagenArticuloServiceImpl extends GenericServiceImpl<ImagenArticulo,Long> implements ImagenArticuloService {

    public ImagenArticuloServiceImpl(GenericRepository<ImagenArticulo, Long> genericRepository) {
        super(genericRepository);
    }
}
