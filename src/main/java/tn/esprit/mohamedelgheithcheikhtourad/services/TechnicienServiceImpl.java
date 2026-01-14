package tn.esprit.mohamedelgheithcheikhtourad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Emplacement;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Technicien;
import tn.esprit.mohamedelgheithcheikhtourad.repositories.TechnicienRepository;

@Service
public class TechnicienServiceImpl implements ITechnicienService{
    @Autowired
    private TechnicienRepository technicienRepository;

    @Override
    public Technicien addTechnicien(Technicien technicien) {
        return this.technicienRepository.save(technicien);
    }
}
