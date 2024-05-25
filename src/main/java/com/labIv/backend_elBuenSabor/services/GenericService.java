package com.labIv.backend_elBuenSabor.services;

import com.labIv.backend_elBuenSabor.entities.GenericEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface GenericService <E extends GenericEntity, Id extends Serializable> {

    Page<E> findAll(Pageable pageable) throws Exception;
    List<E> findAll() throws Exception;
    E findById(Id id) throws Exception;
    E save(E entity) throws Exception;
    E update(Id id, E entity) throws Exception;
    boolean delete(Id id) throws Exception;
}
