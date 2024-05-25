package com.labIv.backend_elBuenSabor.repositories;

import com.labIv.backend_elBuenSabor.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario,Long> {
}
