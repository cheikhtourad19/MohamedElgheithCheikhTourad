package tn.esprit.mohamedelgheithcheikhtourad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.EquipementMedicalRepository;

@Service
public class EquipementMedicalServiceImpl implements IEquipementMedicalService{
    @Autowired
    private EquipementMedicalRepository equipementMedicalRepository;
    @Override
    public EquipementMedical addEquipementMedical(EquipementMedical equipementMedical) {
        return this.equipementMedicalRepository.save(equipementMedical);
    }
}
