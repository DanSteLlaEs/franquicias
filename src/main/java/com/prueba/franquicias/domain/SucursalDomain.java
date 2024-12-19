package com.prueba.franquicias.domain;

import com.prueba.franquicias.persistence.entity.Franquicia;
import com.prueba.franquicias.persistence.entity.Sucursal;

public class SucursalDomain {

    private Integer id;
    private String nombre;
    private Franquicia franquicia;
    private Sucursal sucursal;


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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
