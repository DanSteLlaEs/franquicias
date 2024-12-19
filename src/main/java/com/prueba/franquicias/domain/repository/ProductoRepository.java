package com.prueba.franquicias.domain.repository;

import com.prueba.franquicias.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
