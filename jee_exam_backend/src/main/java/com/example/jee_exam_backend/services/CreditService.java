package com.example.jee_exam_backend.services;

import com.example.jee_exam_backend.dtos.*;

import java.util.List;

public interface CreditService {
    ClientDTO saveCustomer(ClientDTO customerDTO);

    CreditPersonnelDTO saveCreditPersonnel(double montant, Long customerId, String motif);
    CreditProfessionnelDTO SaveCreditProfessionnel(double montant, Long customerId, String motif,String raisonSociale);
    CreditImmobilierDTO saveCreditImmobilier(double montant, Long customerId, String typeBien);

    List<ClientDTO> listClient();
    CreditDTO getCredit(String accountId);


    ClientDTO getClient(Long customerId);

    void deleteClient(Long clientId);

}
