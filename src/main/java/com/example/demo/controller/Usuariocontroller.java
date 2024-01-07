package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.UsuarioRepository;

@Controller
public class Usuariocontroller {
    
    private UsuarioRepository usuarioRepository;

    public Usuariocontroller(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @RequestMapping("/usuario")
    public String getUsuarios(Model model){
        model.addAttribute("usuarioList", this.usuarioRepository.findAll());

        return "usuario";
    }
}
