package tn.esprit.mohamedelgheithcheikhtourad.services;

import tn.esprit.mohamedelgheithcheikhtourad.entities.Emplacement;

public interface IEmplacementService {

    public Emplacement addEmplacement(Emplacement emplacement);
    public Emplacement affecterEquipementAEmplacement(String numeroSerie,Long IdEmplacement);
    public Long findNomById(String nomEmplacement);
}
