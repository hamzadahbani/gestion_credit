package com.example.jee_exam_backend.web;

import com.example.jee_exam_backend.dtos.CreditDTO;
import com.example.jee_exam_backend.services.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class CreditRestController {
    private CreditService creditService;

    @GetMapping("/credits/{creditId}")
    public CreditDTO getCredit(@PathVariable Long creditId)  {
        return creditService.getCredit(creditId);
    }

    @GetMapping("/credits")
    public List<CreditDTO> listCredits() {
        return creditService.listAllCredits();
    }
}
