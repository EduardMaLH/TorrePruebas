package com.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Date fechaNacimiento;
    private String descripcion;
    private String genero;
    private String nuuid;

    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clase;

  //  @ManyToOne
  //  @JoinColumn(name = "rango_id")
   // private Rango rango_id;
    
   

    
}
