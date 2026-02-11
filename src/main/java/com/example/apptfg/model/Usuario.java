package com.example.apptfg.model;

import java.util.ArrayList;

public class Usuario {

    private static int contador = 1;
    private int id;
    private String username;
    private String password;
    private boolean esAdmin;

    public Usuario(String username, String password, boolean esAdmin) {
        this.id = contador++;
        this.username = username;
        this.password = password;
        this.esAdmin = esAdmin;
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean isAdmin() { return esAdmin; }

}