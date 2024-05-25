package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Categoria;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.CategoriaService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends GenericServiceImpl<Categoria,Long> implements CategoriaService {

    public CategoriaServiceImpl(GenericRepository<Categoria, Long> genericRepository) {
        super(genericRepository);
    }
}
