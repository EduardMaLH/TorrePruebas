package com.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Clase;



public interface ClaseRepository extends JpaRepository<Clase, Integer> {
	Clase findById(int id);
}
