package com.example.tponetoone.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Command3 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCommand;
    private Double montant;
    private Integer creatDate;

    @OneToOne
    @JoinTable(name = "T_Clients_Commands_Association",
                joinColumns = @JoinColumn(name = "idCommand"),
                inverseJoinColumns = @JoinColumn(name = "idClient"))
    private Client3 client;
}
