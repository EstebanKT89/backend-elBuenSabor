package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.FacturaVenta;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.FacturaVentaService;
import org.springframework.stereotype.Service;

@Service
public class FacturaVentaServiceImpl extends GenericServiceImpl<FacturaVenta, Long> implements FacturaVentaService {

    public FacturaVentaServiceImpl(GenericRepository<FacturaVenta, Long> genericRepository) {
        super(genericRepository);
    }
}
