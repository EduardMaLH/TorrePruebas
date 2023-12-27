package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entities.Jugador;
import com.repositories.ClaseRepository;
import com.repositories.JugadorRepository;
import com.repositories.RangoRepository;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping
    public String getStatus() {
        return "ok";
    }

  
}

