package com.prueba.franquicias.domain.service;

import com.prueba.franquicias.persistence.entity.Sucursal;

import java.util.List;

public class SucursalRequest {


    private String nombre;
    private Integer id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
