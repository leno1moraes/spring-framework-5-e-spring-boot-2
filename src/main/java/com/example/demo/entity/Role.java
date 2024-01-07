package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;


@Document
public class Role {
    
    @Id
    private String id;
    private String name;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }        
}


// ##################### PARA BANCO DE DADOS RELACIONAL #####################
// @Entity
// public class Role {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;
//     private String name;
    
//     public Long getId() {
//         return id;
//     }
//     public void setId(Long id) {
//         this.id = id;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }        
// }