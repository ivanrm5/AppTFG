package com.example.apptfg.controller;

import org.springframework.ui.Model;
import com.example.apptfg.model.Usuario;
import com.example.apptfg.service.ServiceUsuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final ServiceUsuario serviceUsuario;

    public HomeController(ServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/home")
    public String home(
            @RequestParam(required = false) String username,
            Model model
    ) {
        if (username == null) {
            return "redirect:/auth/login";
        }

        Usuario usuario = serviceUsuario.buscarPorUsername(username);

        if (usuario == null) {
            return "redirect:/auth/login";
        }

        model.addAttribute("usuario", usuario);
        return "home";
    }
}
