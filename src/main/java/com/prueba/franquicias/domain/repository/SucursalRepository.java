package com.prueba.franquicias.domain.repository;

import com.prueba.franquicias.persistence.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<Sucursal,Integer> {
}
