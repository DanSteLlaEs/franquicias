package com.prueba.franquicias.domain.service;

import com.prueba.franquicias.domain.FranquiciaDomain;
import com.prueba.franquicias.domain.repository.FranquiciaRepository;
import com.prueba.franquicias.persistence.entity.Franquicia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FranquiciaService {

    @Autowired
    private FranquiciaRepository franquiciaRepository;



    public FranquiciaDomain create(FranquiciaDomain franquiciaDomain){
        Franquicia franquicia=new Franquicia();
        franquicia.setNombre(franquiciaDomain.getNombre());
        franquicia.setIdFranquicia(franquiciaDomain.getId());

         Franquicia franquicia1= franquiciaRepository.save(franquicia);
         FranquiciaDomain franquiciaDomain1=new FranquiciaDomain();
         franquiciaDomain1.setId(franquicia1.getIdFranquicia());
         franquiciaDomain1.setNombre(franquicia1.getNombre());
         return franquiciaDomain1;
    }
    public FranquiciaDomain update(FranquiciaDomain franquicia,Integer id){
        Optional<Franquicia> franquicia1 =franquiciaRepository.findById(id);
        if(franquicia1.isPresent()){
            franquicia1.get().setNombre(franquicia.getNombre());
           Franquicia result= franquiciaRepository.save(franquicia1.get());
           FranquiciaDomain franquiciaDomain=new FranquiciaDomain();
           franquiciaDomain.setNombre(result.getNombre());
           franquiciaDomain.setId(result.getIdFranquicia());
           return franquiciaDomain;

        }
        return null;
    }

}
