package com.example.apptfg.service;

import com.example.apptfg.model.Usuario;
import com.example.apptfg.repository.RepositoryUsuario;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario {

    private final RepositoryUsuario repositoryUsuario;

    public ServiceUsuario(RepositoryUsuario repositoryUsuario) {
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
}
