package tn.esprit.mohamedelgheithcheikhtourad.services;

import tn.esprit.mohamedelgheithcheikhtourad.entities.Intervention;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Technicien;

import java.util.List;

public interface IInterventionService {
    public Intervention planifierIntervention(Intervention intervention,String numeroSerie);
    public Intervention assignerEquipeAIntervention(Long  IdIntervention , List<String> nomTechnicien);

}
