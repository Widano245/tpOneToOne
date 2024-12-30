package com.example.tponetoone.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Setter @Getter
public class Client2 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String nom;
    private String email;

    @OneToOne(mappedBy = "client")
    private Command2 command;
}
