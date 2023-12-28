package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.entities.Clase;
import com.entities.Jugador;
import com.repositories.ClaseRepository;
import com.repositories.JugadorRepository;
import com.repositories.RangoRepository;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository JugadorRepository;
    @Autowired
    private ClaseRepository ClaseRepository;

    @GetMapping("/status")
    public String getStatus() {
        return "ok";
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> requestBody) {
        
      String nombre = requestBody.get("nombre");
  
  String nuuid = JugadorRepository.findNuuidByNombre(nombre);

        if (nuuid != null) {
            return ResponseEntity.ok(nuuid);
        } else {
           
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Jugador no encontrado");
        }
    }
    @GetMapping("/clase/{nombreClase}")
    public ResponseEntity<List<Jugador>> getJugadoresPorClase(@PathVariable String nombreClase) {
        Clase clase = ClaseRepository.findByNombre(nombreClase);
        if (clase == null) { 
            return ResponseEntity.notFound().build();
        }
        List<Jugador> jugadores = JugadorRepository.findByClase(clase);
        return ResponseEntity.ok(jugadores);
    }
  
}

