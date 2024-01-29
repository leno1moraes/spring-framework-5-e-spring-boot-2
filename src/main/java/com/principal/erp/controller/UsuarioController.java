package com.principal.erp.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.principal.erp.entity.Usuario;

@RestController
public class UsuarioController {
    
    @RequestMapping(value = "listausuarios", method=RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario("Leno", "leno@gmail.com");

        usuarios.add(usuario1);

        return usuarios;
    }
    
}
