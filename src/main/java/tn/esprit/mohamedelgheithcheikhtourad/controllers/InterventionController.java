package tn.esprit.mohamedelgheithcheikhtourad.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Intervention;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.InterventionRepository;
import tn.esprit.mohamedelgheithcheikhtourad.services.InterventionServiceImpl;

import java.util.List;

@Tag("Intervention controller")
@RestController("intervention")
public class InterventionController {
    @Autowired
    private InterventionServiceImpl interventionService;

    @PostMapping("/create/{numero}")
    public Intervention createIntervention(@RequestBody Intervention intervention, @PathVariable String numero) {
        return this.interventionService.planifierIntervention(intervention,numero);
    }
    @PutMapping("/assignTeam/{id}")
    public Intervention assignTeam(@RequestBody List<String> noms, @PathVariable Long id) {
        return this.interventionService.assignerEquipeAIntervention(id, noms);

    }
}
