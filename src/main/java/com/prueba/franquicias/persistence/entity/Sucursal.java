package com.prueba.franquicias.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sucursales")
public class Sucursal {

    @Id
    @Column(name = "idSucursal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSucursal;

    @Column(name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "franquicias_idfranquicias")
    private Franquicia franquicia;

    @OneToMany(mappedBy = "sucursal")
    private List<Producto> listaProductos;


    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
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

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
