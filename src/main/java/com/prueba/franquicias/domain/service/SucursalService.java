package com.prueba.franquicias.domain.service;

import com.prueba.franquicias.domain.SucursalDomain;
import com.prueba.franquicias.domain.repository.FranquiciaRepository;
import com.prueba.franquicias.domain.repository.SucursalRepository;
import com.prueba.franquicias.persistence.entity.Franquicia;
import com.prueba.franquicias.persistence.entity.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Autowired
    private FranquiciaRepository franquiciaRepository;


    public SucursalDomain addSurcursales(SucursalDomain sucursalDomain, Integer id) {
        Optional<Franquicia> franquicia1 = franquiciaRepository.findById(id);
        if (franquicia1.isPresent()) {
            Sucursal sucursal=new Sucursal();
            sucursal.setNombre(sucursalDomain.getNombre());
            sucursal.setIdSucursal(sucursalDomain.getId());
            Franquicia franquicia=new Franquicia();
            franquicia.setIdFranquicia(id);
            sucursal.setFranquicia(franquicia1.get());
            Sucursal sucursal1 = sucursalRepository.save(sucursal);
            SucursalDomain sucursalDomain1 = new SucursalDomain();
            sucursalDomain1.setNombre(sucursal1.getNombre());
            sucursalDomain1.setId(sucursal1.getIdSucursal());
            sucursalDomain1.setFranquicia(franquicia);
            return sucursalDomain1;
        }
        return null;
    }

   /* public SucursalDomain create(SucursalDomain sucursalDomain){
        Sucursal sucursal=new Sucursal();
        sucursal.setNombre(sucursalDomain.getNombre());

        Franquicia franquicia1= franquiciaRepository.save(franquicia);
        FranquiciaDomain franquiciaDomain1=new FranquiciaDomain();
        franquiciaDomain1.setId(franquicia1.getIdFranquicia());
        franquiciaDomain1.setNombre(franquicia1.getNombre());
        return franquiciaDomain1;
    }*/
}
