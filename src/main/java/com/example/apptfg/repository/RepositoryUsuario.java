package com.example.apptfg.repository;

import com.example.apptfg.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    public RepositoryUsuario() {
        usuarios.add(new Usuario("admin", "admin","usuario@gmail.com" ,true));
        usuarios.add(new Usuario("usuario", "usuario","admin@gmail.com",false));
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

    public Usuario buscarCorreo(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(correo)) {
                return usuario;
            }
        }
        return null;
    }
    public boolean existeUsername(String username) {
        return usuarios.stream()
                .anyMatch(u -> u.getUsername().equalsIgnoreCase(username));
    }

    public boolean existeEmail(String email) {
        return usuarios.stream()
                .anyMatch(u -> u.getEmail().equalsIgnoreCase(email));
    }

    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

}

