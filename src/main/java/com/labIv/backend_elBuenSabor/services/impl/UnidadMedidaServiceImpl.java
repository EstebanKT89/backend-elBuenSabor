package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.UnidadMedida;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.UnidadMedidaService;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaServiceImpl extends GenericServiceImpl<UnidadMedida, Long> implements UnidadMedidaService {

    public UnidadMedidaServiceImpl(GenericRepository<UnidadMedida, Long> genericRepository) {
        super(genericRepository);
    }
}
