package com.example.demo.config;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

/**
 * DataInitizr
 */
@Component
public class DataInitizr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //System.out.println("Iniciando aqui e agora $$$$$$$$ ######### xxxxxxxxxxxx");

        List<Usuario> usuarios = usuarioRepository.findAll();

        if (usuarios.isEmpty()){
            createUsuario("Maria 2", "maria@email");
            createUsuario("Joao 2", "joao@email");
            createUsuario("Julia 2", "julia@email");
        }
    }

    public void createUsuario(String name, String email){
        Usuario usuario = new Usuario(name, email);
        usuarioRepository.save(usuario);
    }
}