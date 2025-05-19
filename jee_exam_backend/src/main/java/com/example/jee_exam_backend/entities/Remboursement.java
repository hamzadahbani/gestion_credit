package com.example.jee_exam_backend.entities;

import com.example.jee_exam_backend.enums.TypeRemboursement;
import jakarta.persistence.*;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Remboursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private double montant;
    private TypeRemboursement type;

    @ManyToOne
    @JoinColumn(name = "credit_id")
    private Credit credit;

    // Getters et Setters
}