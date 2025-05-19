package com.example.jee_exam_backend.entities;

import com.example.jee_exam_backend.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Credit {
    @Id
    @GeneratedValue
    private Long id;
    private Date dateDemande;
    @Enumerated(EnumType.STRING)
    private StatutCredit statut;
    private Date dateAcception;
    private double montant;
    private int dureeRemboursement; // in months or years
    private double tauxInteret;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "credit")
    private List<Remboursement> remboursements;
}

