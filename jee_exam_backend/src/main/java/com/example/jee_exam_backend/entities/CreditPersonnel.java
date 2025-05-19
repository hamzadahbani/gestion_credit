package com.example.jee_exam_backend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PERSONNEL")
public class CreditPersonnel extends Credit {
    private String motif;
}
