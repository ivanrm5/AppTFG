package com.example.apptfg.repository;

import com.example.apptfg.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    public RepositoryUsuario() {
        usuarios.add(new Usuario("admin", "admin", true));
        usuarios.add(new Usuario("usuario", "usuario", false));
    }

    public Usuario login(String username, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equalsIgnoreCase(username)
                    && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarPorUsername(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equalsIgnoreCase(username)) {
                return usuario;
            }
        }
        return null;
    }

}

