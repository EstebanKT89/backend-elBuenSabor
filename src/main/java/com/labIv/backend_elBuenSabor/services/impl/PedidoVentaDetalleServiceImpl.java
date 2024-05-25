package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.PedidoVentaDetalle;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.PedidoVentaDetalleService;
import org.springframework.stereotype.Service;

@Service
public class PedidoVentaDetalleServiceImpl extends GenericServiceImpl<PedidoVentaDetalle, Long> implements PedidoVentaDetalleService {

    public PedidoVentaDetalleServiceImpl(GenericRepository<PedidoVentaDetalle, Long> genericRepository) {
        super(genericRepository);
    }
}
