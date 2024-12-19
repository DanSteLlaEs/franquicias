package com.prueba.franquicias.controller;

import com.prueba.franquicias.domain.SucursalDomain;
import com.prueba.franquicias.domain.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/franquicia/{id}/sucursal")
    public SucursalResponse addSucursal(@RequestBody SucursalRequest sucursalRequest, @PathVariable Integer id) {
        SucursalDomain sucursalDomain = new SucursalDomain();
        sucursalDomain.setNombre(sucursalRequest.getNombre());

        SucursalDomain sucursalDomain1 = sucursalService.addSurcursales(sucursalDomain, id);
        SucursalResponse sucursalResponse = new SucursalResponse();
        sucursalResponse.setNombre(sucursalDomain1.getNombre());
        sucursalResponse.setId(sucursalDomain1.getId());
        sucursalResponse.setFranquicia(sucursalDomain1.getFranquicia());
        return sucursalResponse;
    }
}
