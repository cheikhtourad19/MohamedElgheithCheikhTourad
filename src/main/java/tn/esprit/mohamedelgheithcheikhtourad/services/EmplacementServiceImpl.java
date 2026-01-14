package tn.esprit.mohamedelgheithcheikhtourad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Emplacement;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.EmplacementRepository;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.EquipementMedicalRepository;

@Service
public class EmplacementServiceImpl implements IEmplacementService{

    @Autowired
    private EmplacementRepository emplacementRepository;
    @Autowired
    private EquipementMedicalRepository equipementMedicalRepository;
    @Override
    public Emplacement addEmplacement(Emplacement emplacement) {
        return this.emplacementRepository.save(emplacement);
    }

    @Override
    public Emplacement affecterEquipementAEmplacement(String numeroSerie, Long IdEmplacement) {
        Emplacement emplacement = this.emplacementRepository.findById(IdEmplacement).orElseThrow(
                ()->new RuntimeException("emplacement n'existe pas")
        );
        EquipementMedical equipementMedical=equipementMedicalRepository.findByNumeroSerie(numeroSerie).orElseThrow(
                ()->new RuntimeException("emplacement n'existe pas")
        );
        emplacement.getEquipementMedicals().add(equipementMedical);
        emplacementRepository.save(emplacement);
        equipementMedical.setEmplacement(emplacement);
        equipementMedicalRepository.save(equipementMedical);

        return emplacement;
    }

    @Override
    public Long findNomById(String nomEmplacement) {
        Emplacement emplacement = this.emplacementRepository.findByNomSalle(nomEmplacement).orElseThrow(
                ()->new RuntimeException("emplacement n'existe pas")
        );
        return emplacement.getId();
    }
}
