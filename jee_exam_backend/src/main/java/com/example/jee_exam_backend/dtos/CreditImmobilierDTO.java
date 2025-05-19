package com.example.jee_exam_backend.dtos;

import com.example.jee_exam_backend.enums.StatutCredit;
import com.example.jee_exam_backend.enums.TypeBien;
import lombok.Data;

@Data
public class CreditImmobilierDTO extends CreditDTO{
    private TypeBien typeBien;

}
