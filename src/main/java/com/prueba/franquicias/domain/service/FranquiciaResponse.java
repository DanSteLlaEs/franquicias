package com.prueba.franquicias.domain.service;

import com.prueba.franquicias.persistence.entity.Franquicia;
import com.prueba.franquicias.persistence.entity.Sucursal;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public class FranquiciaResponse {

    private Integer id;
    private String nombre;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
