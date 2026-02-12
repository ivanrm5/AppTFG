package com.example.apptfg.model;

import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
public class Ejercicio{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    private String musculoPrimario;
    @ManyToOne
    private Usuario usuario;

    public Ejercicio(Long id, String nombre, String musculoPrimario, Usuario usuario) {

    }

}
