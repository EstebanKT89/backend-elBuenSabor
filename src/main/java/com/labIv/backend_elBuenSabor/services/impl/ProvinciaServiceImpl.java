package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Provincia;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.ProvinciaService;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl extends GenericServiceImpl<Provincia, Long> implements ProvinciaService {

    public ProvinciaServiceImpl(GenericRepository<Provincia, Long> genericRepository) {
        super(genericRepository);
    }
}
