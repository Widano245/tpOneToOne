package com.example.tponetoone.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Client3 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String nom;
    private String email;

    @OneToOne
    @JoinTable(name = "T_Clients_Commands_Association",
                joinColumns = @JoinColumn(name = "idClient"),
                inverseJoinColumns = @JoinColumn(name = "idCommand") )
    private Command3 command;
}
