package com.example.jee_exam_backend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PROFESSIONNEL")
public class CreditProfessionnel extends Credit {
    private String motif;
    private String raisonSociale;
}
