package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.ArticuloInsumo;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.ArticuloInsumoService;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoServiceImpl extends GenericServiceImpl<ArticuloInsumo,Long> implements ArticuloInsumoService {

    public ArticuloInsumoServiceImpl(GenericRepository<ArticuloInsumo, Long> genericRepository) {
        super(genericRepository);
    }
}
