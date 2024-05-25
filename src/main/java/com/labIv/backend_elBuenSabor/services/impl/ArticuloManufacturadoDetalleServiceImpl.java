package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.ArticuloManufacturadoDetalle;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.ArticuloManufacturadoDetalleService;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleServiceImpl extends GenericServiceImpl<ArticuloManufacturadoDetalle, Long> implements ArticuloManufacturadoDetalleService {

    public ArticuloManufacturadoDetalleServiceImpl(GenericRepository<ArticuloManufacturadoDetalle, Long> genericRepository) {
        super(genericRepository);
    }
}
