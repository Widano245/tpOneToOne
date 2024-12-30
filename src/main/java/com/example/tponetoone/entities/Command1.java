package com.example.tponetoone.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Command1 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCommand;
    private double montant;

    @OneToOne
    @JoinColumn(name = "idClient")
    private Client1 client;
}
