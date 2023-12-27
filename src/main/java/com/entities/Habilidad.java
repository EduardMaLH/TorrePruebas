package com.entities;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;
    private String nuuid;

    @ManyToOne
    @JoinColumn(name = "rango_id")
    private Rango rango;

    
}
