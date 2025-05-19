package com.example.jee_exam_backend.dtos;

import com.example.jee_exam_backend.enums.TypeRemboursement;
import lombok.Data;

import java.util.Date;

@Data
public class RemboursementDTO {
    private Long id;
    private Date date;
    private double montant;
    private TypeRemboursement type;
    private Long creditId;
}
