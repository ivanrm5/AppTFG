package com.example.apptfg.model;

import java.util.ArrayList;

public class Usuario {
    private static int contador=1;
    private int id;
    private String username;
    private String password;
   // private ArrayList<RutinaEjercicios> rutinas;
    private boolean esAdmin;


    public Usuario(String username, String password, boolean esAdmin){
        this.id=contador;
        contador++;
        this.username=username;
        this.password=password;
        //this.rutinas=rutinas;
        this.esAdmin=esAdmin;

    }

    public int getId(){return id;}
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    //public ArrayList<RutinaEjercicios> getRutinas(){return rutinas;}
    public boolean isAdmin(){return esAdmin;}


}
