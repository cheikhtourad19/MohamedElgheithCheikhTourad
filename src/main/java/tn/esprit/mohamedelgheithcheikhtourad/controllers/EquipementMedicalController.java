package tn.esprit.mohamedelgheithcheikhtourad.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Emplacement;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;
import tn.esprit.mohamedelgheithcheikhtourad.entities.StatuOperation;
import tn.esprit.mohamedelgheithcheikhtourad.services.EquipementMedicalServiceImpl;

import java.util.Date;


@RestController
@Tag("Equippement controller")
@RequestMapping("/equippement")
public class EquipementMedicalController {

    @Autowired
    private EquipementMedicalServiceImpl equipementMedicalService;



    @PostMapping("/add")
    public EquipementMedical addEquipement(@RequestBody EquipementMedical equipementMedical) {
        return this.equipementMedicalService.addEquipementMedical(equipementMedical);
    }
}
