package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.PedidoVenta;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.PedidoVentaService;
import org.springframework.stereotype.Service;

@Service
public class PedidoVentaServiceImpl extends GenericServiceImpl<PedidoVenta,Long> implements PedidoVentaService {

    public PedidoVentaServiceImpl(GenericRepository<PedidoVenta, Long> genericRepository) {
        super(genericRepository);
    }
}
