package com.example.WebFinalProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String phone;
    private String message;
}
