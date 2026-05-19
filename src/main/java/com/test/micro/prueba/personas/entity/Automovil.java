
package com.test.micro.prueba.personas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "automovil")
@Data
public class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String marca;
    private String linea;
    private Integer modelo;
}