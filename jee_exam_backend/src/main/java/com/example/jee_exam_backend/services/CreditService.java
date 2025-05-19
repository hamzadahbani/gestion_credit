package com.example.jee_exam_backend.services;

import com.example.jee_exam_backend.dtos.*;

import java.util.List;

public interface CreditService {
    ClientDTO saveClient(ClientDTO clientDTO);
    ClientDTO getClient(Long clientId);
    ClientDTO updateClient(ClientDTO clientDTO);
    void deleteClient(Long clientId);
    List<ClientDTO> listClients();
    List<ClientDTO> searchClients(String keyword);

    CreditPersonnelDTO saveCreditPersonnel(CreditPersonnelDTO creditPersonnelDTO);
    CreditImmobilierDTO saveCreditImmobilier(CreditImmobilierDTO creditImmobilierDTO);
    CreditProfessionnelDTO saveCreditProfessionnel(CreditProfessionnelDTO creditProfessionnelDTO);

    CreditDTO getCredit(Long creditId);
    List<CreditDTO> listCreditsByClient(Long clientId);
    List<CreditDTO> listAllCredits();

    RemboursementDTO saveRemboursement(RemboursementDTO remboursementDTO);
    List<RemboursementDTO> listRemboursementsByCredit(Long creditId);
    List<RemboursementDTO> listAllRemboursements();
}
