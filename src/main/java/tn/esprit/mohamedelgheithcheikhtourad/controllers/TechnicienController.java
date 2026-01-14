package tn.esprit.mohamedelgheithcheikhtourad.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Emplacement;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Technicien;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.TechnicienRepository;
import tn.esprit.mohamedelgheithcheikhtourad.services.TechnicienServiceImpl;

@Tag("Technicien controller")
@RestController("technicien")
public class TechnicienController {

    @Autowired
    private TechnicienServiceImpl technicienService;


    @PostMapping
    public Technicien addTechnicien(@RequestBody Technicien technicien) {
        return technicienService.addTechnicien(technicien);
    }

}
