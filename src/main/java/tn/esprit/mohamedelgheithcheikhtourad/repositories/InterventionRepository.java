package tn.esprit.mohamedelgheithcheikhtourad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention,Long> {
}
