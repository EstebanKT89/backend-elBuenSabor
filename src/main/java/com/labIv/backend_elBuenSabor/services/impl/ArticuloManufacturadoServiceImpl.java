package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.ArticuloManufacturado;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.ArticuloManufacturadoService;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoServiceImpl extends GenericServiceImpl<ArticuloManufacturado,Long> implements ArticuloManufacturadoService {

    public ArticuloManufacturadoServiceImpl(GenericRepository<ArticuloManufacturado, Long> genericRepository) {
        super(genericRepository);
    }
}
