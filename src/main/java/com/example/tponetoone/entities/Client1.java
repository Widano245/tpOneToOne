package com.example.tponetoone.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Client1 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String nom;
    private String email;
}
