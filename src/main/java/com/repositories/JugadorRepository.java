package com.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.entities.Clase;
import com.entities.Jugador;
import com.entities.Rango;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
    List<Jugador> findByClase(Clase clase);
    List<Jugador> findByRango(Rango rango);
   String findNuuidByNombre(@Param("nombre") String nombre);
}

