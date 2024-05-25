package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Empresa;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.EmpresaService;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends GenericServiceImpl<Empresa,Long> implements EmpresaService {

    public EmpresaServiceImpl(GenericRepository<Empresa, Long> genericRepository) {
        super(genericRepository);
    }
}
