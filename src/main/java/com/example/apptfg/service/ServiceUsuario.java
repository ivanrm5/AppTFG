package com.example.apptfg.service;

import com.example.apptfg.model.Usuario;
import com.example.apptfg.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario {

    private final UsuarioRepository repositoryUsuario;

    public ServiceUsuario(UsuarioRepository repositoryUsuario) {
        this.repositoryUsuario = repositoryUsuario;
    }

    public Usuario login(String username, String password) {
        return repositoryUsuario.login(username, password);
    }

    public boolean esAdmin(Usuario usuario) {
        return usuario != null && usuario.isAdmin();
    }

    public Usuario buscarPorUsername(String username) {
        return repositoryUsuario.buscarPorUsername(username);
    }

    public String registrar(String username, String email, String password) {

        if (repositoryUsuario.existeUsername(username)) {
            return "El nombre de usuario ya está en uso";
        }

        if (repositoryUsuario.existeEmail(email)) {
            return "El correo ya está registrado";
        }

        Usuario nuevoUsuario = new Usuario(username, email, password, false);
        repositoryUsuario.guardar(nuevoUsuario);

        return null; // null = registro correcto
    }

}
