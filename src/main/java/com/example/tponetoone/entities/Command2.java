package com.example.tponetoone.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Command2 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCommand;
    private Double montant;
    private Integer creatDate;

    @OneToOne
    @JoinColumn(name = "idClient")
    private Client2 client;
}
