package com.labIv.backend_elBuenSabor.controllers;

import com.labIv.backend_elBuenSabor.entities.GenericEntity;
import com.labIv.backend_elBuenSabor.services.impl.GenericServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class GenericControllerImpl <E extends GenericEntity, GenericService extends GenericServiceImpl<E, Long>> implements GenericController<E, Long> {

    protected GenericService servicio;

    public GenericControllerImpl(GenericService servicio) {
        this.servicio = servicio;
    }

    @GetMapping("")
    public ResponseEntity<?> findAll(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.findAll());
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }

    @GetMapping("/paged")
    public ResponseEntity<?> findAll(Pageable pageable){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.findAll(pageable));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.findById(id));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.save(entity));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.update(id, entity));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body(servicio.delete(id));
        }catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\":\""+ e.getMessage() + "\"}");
        }
    }
}
