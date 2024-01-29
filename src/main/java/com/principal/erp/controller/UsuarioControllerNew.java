package com.principal.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.principal.erp.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsuarioControllerNew {
    
    @GetMapping("/cadastrarusuario")
    public String getFormCadUsuario(Model model) {

        model.addAttribute("usuario", new Usuario(null, null));

        return "cadusuario";
    }
    
}
