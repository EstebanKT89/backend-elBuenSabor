package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Pais;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.PaisService;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl extends GenericServiceImpl<Pais,Long> implements PaisService {

    public PaisServiceImpl(GenericRepository<Pais, Long> genericRepository) {
        super(genericRepository);
    }
}
