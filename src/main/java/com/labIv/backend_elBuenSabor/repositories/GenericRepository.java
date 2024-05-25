package com.labIv.backend_elBuenSabor.repositories;

import com.labIv.backend_elBuenSabor.entities.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface GenericRepository <E extends GenericEntity, Id extends Serializable> extends JpaRepository<E, Id> {
}
