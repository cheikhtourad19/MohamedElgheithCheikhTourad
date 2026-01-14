package tn.esprit.mohamedelgheithcheikhtourad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Intervention;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Technicien;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.EquipementMedicalRepository;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.InterventionRepository;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.TechnicienRepository;

import java.util.List;

@Service
public class InterventionServiceImpl implements IInterventionService{
    @Autowired
    private InterventionRepository interventionRepository;
    @Autowired
    private EquipementMedicalRepository equipementMedicalRepository;

    @Autowired
    private TechnicienRepository technicienRepository;
    @Override
    public Intervention planifierIntervention(Intervention intervention,String numeroSerie) {
        EquipementMedical equipementMedical=this.equipementMedicalRepository.findByNumeroSerie(numeroSerie).orElseThrow(
                ()->new RuntimeException("Equipement n'existe pas ")
        );

        equipementMedical.getInterventions().add(intervention);
        this.equipementMedicalRepository.save(equipementMedical);
        intervention.setEquipementMedical(equipementMedical);
        this.interventionRepository.save(intervention);
        return this.interventionRepository.save(intervention);

    }

    @Override
    public Intervention assignerEquipeAIntervention(Long IdIntervention, List<String> nomTechnicien) {
        List<Technicien> techniciens = this.technicienRepository.findAllByNomIn(nomTechnicien).orElseThrow(
                ()->new RuntimeException("erruer")
        );

        Intervention intervention = interventionRepository.findById(IdIntervention).orElseThrow(
                ()->new RuntimeException("Intervention n'existe pas ")
        );

        techniciens.forEach(technicien -> {
            technicien.getInterventions().add(intervention);
            this.technicienRepository.save(technicien);
        });
        intervention.setTechniciens(techniciens);
        this.interventionRepository.save(intervention);
        return this.interventionRepository.save(intervention);
    }
}
