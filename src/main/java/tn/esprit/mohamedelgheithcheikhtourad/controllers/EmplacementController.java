package tn.esprit.mohamedelgheithcheikhtourad.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Emplacement;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import tn.esprit.mohamedelgheithcheikhtourad.services.EmplacementServiceImpl;

@RestController()
@RequestMapping("/emplacement")
@Tag("Emplacement controller")
public class EmplacementController {

    @Autowired
    private EmplacementServiceImpl emplacementService;



    @PostMapping("/add")
    public Emplacement addEmplacement(@RequestBody Emplacement emplacement) {
        return this.emplacementService.addEmplacement(emplacement);
    }
    @PutMapping("affecter/{numeroSerie}/{idEmplacement}")
    public Emplacement affecter(@PathVariable("numeroSerie") String numeroSerie , @PathVariable Long idEmplacement) {
        return this.emplacementService.affecterEquipementAEmplacement(numeroSerie,idEmplacement);
    }

}
