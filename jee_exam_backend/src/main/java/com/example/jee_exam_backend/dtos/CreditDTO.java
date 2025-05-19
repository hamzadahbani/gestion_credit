package com.example.jee_exam_backend.dtos;

import com.example.jee_exam_backend.enums.StatutCredit;
import lombok.Data;

import java.util.Date;

@Data
public class CreditDTO {
    private Long id;
    private Date dateDemande;
    private StatutCredit statut;
    private Date dateAcception;
    private double montant;
    private int dureeRemboursement;
    private double tauxInteret;
    private Long clientId;
}
