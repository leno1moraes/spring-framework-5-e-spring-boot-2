package com.example.demo.entity;



import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

//import java.util.Set;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToMany;



// ##################### PARA NO SQL #####################
@Document
public class Usuario {
    
    @Id
    private String id;
    private String name;
    private String email;

    public Usuario() {

    }

    public Usuario(String name, String email){
        super();
        this.name = name;
        this.email = email;
    }

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}


// ##################### PARA BANCO DE DADOS RELACIONAL #####################
// @Entity
// public class Usuario {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;
//     private String name;
//     private String email;

//     @ManyToMany
//     private Set<Role> roles;

//     public Usuario() {

//     }

//     public Usuario(String name, String email){
//         super();
//         this.name = name;
//         this.email = email;
//     }

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
//     public String getEmail() {
//         return email;
//     }
//     public void setEmail(String email) {
//         this.email = email;
//     }

    
// }
