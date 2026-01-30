package com.example.apptfg.repository;

import com.example.apptfg.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RepositoryUsuario {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public RepositoryUsuario(){
        usuarios.add(new Usuario("admin", "admin", true));
        usuarios.add(new Usuario("usuario", "usuario", false));
    }


    public Usuario devolverUsuario(String username, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equalsIgnoreCase(username) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }


    public boolean login(String username, String password){
        for(Usuario usuario :usuarios){
            if (usuario.getUsername().equalsIgnoreCase(username) && usuario.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    private boolean esAdmin(int id){
        for(Usuario usuario: usuarios){
            if(usuario.getId()==id && usuario.isAdmin()){
                return true;
            }
        }
        return false;
    }

    private boolean comprobarUsername(String username){
        for(Usuario usuario : usuarios) {
            if(usuario.getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }

}
