package com.example.apptfg.controller;

import org.springframework.ui.Model;
import com.example.apptfg.model.Usuario;
import com.example.apptfg.service.ServiceUsuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {

    private final ServiceUsuario serviceUsuario;

    public HomeController(ServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/usuario")
    public String homeUsuario(@RequestParam String username, Model model) {
        model.addAttribute("username", username);
        return "home";
    }
}
