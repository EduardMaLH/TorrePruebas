package com.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Clase;
import java.util.List;


public interface ClaseRepository extends JpaRepository<Clase, Integer> {
	Clase findById(int id);
}
