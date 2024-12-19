package com.prueba.franquicias.domain.service;

import com.prueba.franquicias.persistence.entity.Franquicia;
import com.prueba.franquicias.persistence.entity.Sucursal;

import java.util.List;

public class SucursalResponse {

    private Integer id;
    private String nombre;
    private Franquicia franquicia;


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

    public Franquicia getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(Franquicia franquicia) {
        this.franquicia = franquicia;
    }

}
