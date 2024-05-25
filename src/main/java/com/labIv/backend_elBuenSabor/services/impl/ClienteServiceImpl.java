package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.Cliente;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente,Long> implements ClienteService {

    public ClienteServiceImpl(GenericRepository<Cliente, Long> genericRepository) {
        super(genericRepository);
    }
}
