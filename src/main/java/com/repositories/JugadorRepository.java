package com.repositories;


import org.springframework.data.jpa.repository.JpaRepository;


import com.entities.Clase;
import com.entities.Jugador;
import com.entities.Rango;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
	 List<Jugador> findByClase_id(Integer id);
  //  List<Jugador> findByRango(Rango rango_id);
	Jugador findNuuidByNombre( String nombre);
}

