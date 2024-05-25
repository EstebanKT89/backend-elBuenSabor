package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.GenericEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface GenericController <E extends GenericEntity, Id extends Serializable> {

    ResponseEntity<?> findAll();

    ResponseEntity<?> findAll(Pageable pageable);

    ResponseEntity<?> getOne(@PathVariable Id id);

    ResponseEntity<?> save(@RequestBody E entity);

    ResponseEntity<?> update(@PathVariable Id id, @RequestBody E entity);

    ResponseEntity<?> delete(@PathVariable Id id);

}
