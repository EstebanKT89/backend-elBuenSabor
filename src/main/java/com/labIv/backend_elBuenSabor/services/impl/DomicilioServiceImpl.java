package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Domicilio;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.DomicilioService;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends GenericServiceImpl<Domicilio,Long> implements DomicilioService {

    public DomicilioServiceImpl(GenericRepository<Domicilio, Long> genericRepository) {
        super(genericRepository);
    }

}
