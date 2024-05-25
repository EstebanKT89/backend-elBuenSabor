package com.labIv.backend_elBuenSabor.repositories;

import com.labIv.backend_elBuenSabor.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends GenericRepository <Cliente,Long> {
}
