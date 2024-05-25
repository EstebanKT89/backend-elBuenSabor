package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Promocion;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.PromocionService;
import org.springframework.stereotype.Service;

@Service
public class PromocionServiceImpl extends GenericServiceImpl<Promocion,Long> implements PromocionService {

    public PromocionServiceImpl(GenericRepository<Promocion, Long> genericRepository) {
        super(genericRepository);
    }
}
