package com.example.jee_exam_backend.web;

import com.example.jee_exam_backend.dtos.ClientDTO;
import com.example.jee_exam_backend.services.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientRestAPI {
    private CreditService creditService;

    @GetMapping("/clients")
    public List<ClientDTO> getClients() {
        return creditService.listClients();
    }
    @GetMapping("/clients/search")
    public List<ClientDTO> searchClients(@RequestParam(name = "keyword", defaultValue = "") String keyword) {
        return creditService.searchClients("%" + keyword + "%");
    }

    @GetMapping("/clients/{id}")
    public ClientDTO getClient(@PathVariable(name = "id") Long clientId) {
        return creditService.getClient(clientId);
    }

    @PostMapping("/clients")
    public ClientDTO saveClient(@RequestBody ClientDTO clientDTO) {
        return creditService.saveClient(clientDTO);
    }

    @PutMapping("/clients/{clientId}")
    public ClientDTO updateClient(@PathVariable Long clientId, @RequestBody ClientDTO clientDTO) {
        clientDTO.setId(clientId);
        return creditService.updateClient(clientDTO);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Long id) {
        creditService.deleteClient(id);
    }

}
