package com.prueba.franquicias.domain.service;

import com.prueba.franquicias.domain.FranquiciaDomain;
import com.prueba.franquicias.domain.ProductoDomain;
import com.prueba.franquicias.domain.SucursalDomain;
import com.prueba.franquicias.domain.repository.FranquiciaRepository;
import com.prueba.franquicias.domain.repository.ProductoRepository;
import com.prueba.franquicias.domain.repository.SucursalRepository;
import com.prueba.franquicias.persistence.entity.Franquicia;
import com.prueba.franquicias.persistence.entity.Producto;
import com.prueba.franquicias.persistence.entity.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private SucursalRepository sucursalRepository;

    @Autowired
    private FranquiciaRepository franquiciaRepository;

    public ProductoDomain createpost(ProductoDomain productoDomain, Integer id,Integer idSucursal){
        Optional<Franquicia> franquicia=franquiciaRepository.findById(id);
        if (franquicia.isPresent()){
            Optional<Sucursal> sucursal=sucursalRepository.findById(idSucursal);
            if(sucursal.isPresent()) {
                Producto producto = new Producto();
                producto.setNombre(productoDomain.getNombre());
                producto.setCantidadStock(productoDomain.getStock());
                producto.setSucursal(productoDomain.getSucursal());
                Sucursal sucursal1 = new Sucursal();
                sucursal1.setIdSucursal(idSucursal);
                producto.setSucursal(sucursal.get());
                Producto result = productoRepository.save(producto);
                ProductoDomain productoDomain1 = new ProductoDomain();
                productoDomain1.setNombre(result.getNombre());
                productoDomain1.setStock(result.getCantidadStock());
                productoDomain1.setId(result.getIdProductos());
                productoDomain1.setSucursal(result.getSucursal());
                return productoDomain1;
            }return null;
        }
        return null;
    }

    public void delete(Integer id){
        Optional<Producto> producto=productoRepository.findById(id);
        if (producto.isPresent()){
            productoRepository.delete(producto.get());
        }

    }
}
