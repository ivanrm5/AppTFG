package com.example.apptfg.controller;

import org.springframework.ui.Model;
import com.example.apptfg.model.Usuario;
import com.example.apptfg.service.ServiceUsuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/auth")
public class LoginController {

    private final ServiceUsuario serviceUsuario;

    public LoginController(ServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    // 👉 Mostrar login
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    // 👉 Procesar login
    @PostMapping("/login")
    public String procesarLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        Usuario usuario = serviceUsuario.login(username, password);

        if (usuario == null) {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }

        // Pasamos el username como "estado"
        return "redirect:/home?username=" + usuario.getUsername();
    }
}
