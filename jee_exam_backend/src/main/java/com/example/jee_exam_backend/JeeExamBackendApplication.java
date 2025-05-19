package com.example.jee_exam_backend;

import com.example.jee_exam_backend.entities.*;
import com.example.jee_exam_backend.enums.StatutCredit;
import com.example.jee_exam_backend.enums.TypeBien;
import com.example.jee_exam_backend.enums.TypeRemboursement;
import com.example.jee_exam_backend.repositories.ClientRepository;
import com.example.jee_exam_backend.repositories.CreditRepository;
import com.example.jee_exam_backend.repositories.RemboursementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class JeeExamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeeExamBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ClientRepository clientRepository,
							CreditRepository creditRepository,
							RemboursementRepository remboursementRepository){
		return args -> {
			Stream.of("Hamid", "Hassan", "Widad").forEach(name->{
				Client client = new Client();
				client.setNom(name);
				client.setEmail(name+"gmail.com");
				clientRepository.save(client);
			});

			clientRepository.findAll().forEach(client -> {
				// CreditImmobilie
				CreditImmobilier creditImmobilier = new CreditImmobilier();
				creditImmobilier.setTypeBien(TypeBien.APPARTEMENT);
				creditImmobilier.setMontant(Math.random()*100000);
				creditImmobilier.setStatut(StatutCredit.EN_COURS);
				creditImmobilier.setClient(client);
				creditRepository.save(creditImmobilier);
				// CreditImmobilie
				CreditProfessionnel creditProfessionnel = new CreditProfessionnel();
				creditProfessionnel.setMotif("motiv 1");
				creditProfessionnel.setRaisonSociale("raison social");
				creditProfessionnel.setMontant(Math.random()*100000);
				creditProfessionnel.setStatut(StatutCredit.EN_COURS);
				creditProfessionnel.setClient(client);
				creditRepository.save(creditImmobilier);
				// CreditImmobilie
				CreditPersonnel creditPersonnel = new CreditPersonnel();
				creditPersonnel.setMotif("motiv 2");
				creditPersonnel.setMontant(Math.random()*100000);
				creditPersonnel.setStatut(StatutCredit.EN_COURS);
				creditPersonnel.setClient(client);
				creditRepository.save(creditImmobilier);
			});

			creditRepository.findAll().forEach(credit->{
				for(int i = 0; i<10; i++){
					Remboursement remboursement = new Remboursement();
					remboursement.setDate(new Date());
					remboursement.setMontant(Math.random()*10000);
					remboursement.setCredit(credit);
					remboursement.setType(Math.random()>0.5? TypeRemboursement.MENSUALITE : TypeRemboursement.REMBOURSEMENT_ANTICIPE);
					remboursementRepository.save(remboursement);
				}
			});
		};
	}


}
