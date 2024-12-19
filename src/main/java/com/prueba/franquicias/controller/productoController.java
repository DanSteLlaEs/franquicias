package com.prueba.franquicias.controller;

import com.prueba.franquicias.domain.FranquiciaDomain;
import com.prueba.franquicias.domain.ProductoDomain;
import com.prueba.franquicias.domain.SucursalDomain;
import com.prueba.franquicias.domain.service.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class productoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/franquicia/{id}/sucursal/{idSucursal}")
    public ProductoResponse create(@RequestBody ProductoRequest productoRequest, @PathVariable Integer id,@PathVariable("idSucursal") Integer idSucursal){
        ProductoDomain productoDomain = new ProductoDomain();
        productoDomain.setNombre(productoRequest.getNombre());
        productoDomain.setStock(productoRequest.getStock());

        ProductoDomain sucursalDomain1 = productoService.createpost(productoDomain,id,idSucursal);
        ProductoResponse productoResponse = new ProductoResponse();
        productoResponse.setNombre(sucursalDomain1.getNombre());
        productoResponse.setStock(sucursalDomain1.getStock());
        productoResponse.setId(sucursalDomain1.getId());
        productoResponse.setSucursal(sucursalDomain1.getSucursal());
        return productoResponse;
    }
    @DeleteMapping("/producto/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        productoService.delete(id);
        return ResponseEntity.ok().build();
    }
}
