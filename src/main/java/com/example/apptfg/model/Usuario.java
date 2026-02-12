package com.example.apptfg.model;

import java.util.ArrayList;

public class Usuario {

    private static int contador = 1;
    private int id;
    private String username;
    private String password;
    private String email;
    private boolean esAdmin;

    public Usuario(String username, String password,String email, boolean esAdmin) {
        this.id = contador++;
        this.username = username;
        this.password = password;
        this.email = email;
        this.esAdmin = esAdmin;
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public  String getEmail() { return email; }
    public boolean isAdmin() { return esAdmin; }

}