package com.prueba.franquicias.domain.repository;

import com.prueba.franquicias.persistence.entity.Franquicia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FranquiciaRepository extends JpaRepository<Franquicia,Integer> {
}
