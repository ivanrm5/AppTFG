package com.example.apptfg.model;

import jakarta.persistence.*;

@Entity
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String musculoPrimario;

    @ManyToOne
    private Usuario usuario;

    public Ejercicio(String nombre, String musculoPrimario, Usuario usuario) {
        this.nombre = nombre;
        this.musculoPrimario = musculoPrimario;
        this.usuario = usuario;
    }

    public Ejercicio() {}

    public String  getNombre() {return nombre;}
    public String  getMusculoPrimario() {return musculoPrimario;}
    public Usuario getUsuario() {return usuario;}
}


