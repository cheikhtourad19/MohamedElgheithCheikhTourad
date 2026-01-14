package tn.esprit.mohamedelgheithcheikhtourad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Technicien;

import java.util.List;
import java.util.Optional;

public interface TechnicienRepository extends JpaRepository<Technicien,Long> {

    public Optional<List<Technicien>> findAllByNomIn(List<String> nomTechnicien);
}
