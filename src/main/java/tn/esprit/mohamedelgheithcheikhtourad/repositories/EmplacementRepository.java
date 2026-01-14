package tn.esprit.mohamedelgheithcheikhtourad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mohamedelgheithcheikhtourad.entities.Emplacement;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;


import java.util.Optional;

public interface EmplacementRepository extends JpaRepository<Emplacement,Long> {
   Optional<Emplacement>findByNomSalle(String nomEmplacement);
}
