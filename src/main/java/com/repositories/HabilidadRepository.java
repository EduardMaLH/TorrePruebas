package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Habilidad;
import com.entities.Rango;

import java.util.List;

public interface HabilidadRepository extends JpaRepository<Habilidad, Integer> {
    List<Habilidad> findByRango(Rango rango);
     
}

