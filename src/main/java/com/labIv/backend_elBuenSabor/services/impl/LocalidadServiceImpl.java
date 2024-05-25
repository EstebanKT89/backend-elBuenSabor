package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Localidad;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.LocalidadService;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends GenericServiceImpl<Localidad,Long> implements LocalidadService {

    public LocalidadServiceImpl(GenericRepository<Localidad, Long> genericRepository) {
        super(genericRepository);
    }

}
