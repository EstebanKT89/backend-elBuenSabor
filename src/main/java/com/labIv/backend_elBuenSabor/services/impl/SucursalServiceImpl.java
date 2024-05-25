package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Sucursal;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.SucursalService;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImpl extends GenericServiceImpl<Sucursal, Long> implements SucursalService {

    public SucursalServiceImpl(GenericRepository<Sucursal, Long> genericRepository) {
        super(genericRepository);
    }
}
