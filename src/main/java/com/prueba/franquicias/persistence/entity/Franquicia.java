package com.prueba.franquicias.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "franquicias")
public class Franquicia {

    @Id
    @Column(name = "idfranquicias")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFranquicia;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "franquicia")
    private List<Sucursal> franquicia;

    public Integer getIdFranquicia() {
        return idFranquicia;
    }

    public void setIdFranquicia(Integer idFranquicia) {
        this.idFranquicia = idFranquicia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sucursal> getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(List<Sucursal> franquicia) {
        this.franquicia = franquicia;
    }
}
