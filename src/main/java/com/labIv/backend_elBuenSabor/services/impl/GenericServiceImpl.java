package com.labIv.backend_elBuenSabor.services.impl;

import com.labIv.backend_elBuenSabor.entities.GenericEntity;
import com.labIv.backend_elBuenSabor.repositories.GenericRepository;
import com.labIv.backend_elBuenSabor.services.GenericService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericServiceImpl <E extends GenericEntity, Id extends Serializable> implements GenericService<E, Id> {

    protected GenericRepository<E, Id> genericRepository;

    public GenericServiceImpl(GenericRepository<E, Id> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception {
        try{
            return genericRepository.findAll(pageable);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = genericRepository.findAll();
            if(entities.isEmpty()) throw new Exception("Aún no se han cargado registros");
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(Id id) throws Exception {
        Optional<E> entityOptional = genericRepository.findById(id);
        if (entityOptional.isPresent()) {
            return entityOptional.get();
        } else {
            throw new Exception("No se encontró ninguna entidad con el ID: " + id);
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = genericRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(Id id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = genericRepository.findById(id);
            if (entityOptional.isEmpty()) throw new Exception("No existe ningún registro con el ID indicado");
            return genericRepository.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Id id) throws Exception {
        try{
            Optional<E> entityOptional = genericRepository.findById(id);
            if (entityOptional.isPresent()) {
                E entity = entityOptional.get();
                entity.setBaja(true);
                genericRepository.save(entity);
                return true;
            } else {
                throw new Exception("No existe ningún registro con el ID indicado");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
