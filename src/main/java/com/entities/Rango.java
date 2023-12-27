package com.entities;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Rango {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;
    private String nuuid;

  
}
