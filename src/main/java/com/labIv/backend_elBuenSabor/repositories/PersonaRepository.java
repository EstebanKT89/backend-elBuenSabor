package com.labIv.backend_elBuenSabor.repositories;

import com.labIv.backend_elBuenSabor.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends GenericRepository<Persona,Long> {
}
