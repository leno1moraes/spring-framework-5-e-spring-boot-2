package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
}

// ##################### PARA BANCO DE DADOS RELACIONAL #####################
// public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
// }