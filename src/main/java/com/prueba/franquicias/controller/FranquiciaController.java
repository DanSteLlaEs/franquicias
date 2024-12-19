package com.prueba.franquicias.controller;

import com.prueba.franquicias.domain.FranquiciaDomain;
import com.prueba.franquicias.domain.service.FranquiciaRequest;
import com.prueba.franquicias.domain.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FranquiciaController {

    @Autowired
    private FranquiciaService franquiciaService;

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/franquicia")
    public FranquiciaResponse createp(@RequestBody FranquiciaRequest franquiciaRequest){
       FranquiciaDomain franquiciaDomain=  new FranquiciaDomain();
        franquiciaDomain.setNombre(franquiciaRequest.getNombre());
        FranquiciaDomain franquiciaDomain1= franquiciaService.create(franquiciaDomain);
        FranquiciaResponse franquiciaResponse=new FranquiciaResponse();
        franquiciaResponse.setNombre(franquiciaDomain1.getNombre());
        franquiciaResponse.setId(franquiciaDomain1.getId());
        return franquiciaResponse;
    }

    @PutMapping("/franquicia/{id}")
    public FranquiciaResponse update(@RequestBody FranquiciaRequest franquiciaRequest, @PathVariable Integer id){
        FranquiciaDomain franquicia=  new FranquiciaDomain();
        franquicia.setNombre(franquiciaRequest.getNombre());
        FranquiciaDomain franquiciaDomain= franquiciaService.update(franquicia,id);
        FranquiciaResponse franquiciaResponse=new FranquiciaResponse();
        franquiciaResponse.setId(franquiciaDomain.getId());
        franquiciaResponse.setNombre(franquiciaDomain.getNombre());
        return franquiciaResponse;
    }
   /* @PostMapping("/franquicia/{id}/sucursal")
    public FranquiciaResponse addSucursal(@RequestBody SucursalRequest sucursalRequest,@PathVariable Integer id){
        SucursalDomain sucursalDomain=  new SucursalDomain();
        sucursalDomain.setNombre(sucursalRequest.getNombre());

        FranquiciaDomain franquiciaDomain1= sucursalService.addSurcursales(sucursalDomain,id);
        FranquiciaResponse franquiciaResponse=new FranquiciaResponse();
        franquiciaResponse.setNombre(franquiciaDomain1.getNombre());
        franquiciaResponse.setId(franquiciaDomain1.getId());
        return franquiciaResponse;
    }*/

}
