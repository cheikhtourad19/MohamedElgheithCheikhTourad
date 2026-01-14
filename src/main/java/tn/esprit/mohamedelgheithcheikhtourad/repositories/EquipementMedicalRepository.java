package tn.esprit.mohamedelgheithcheikhtourad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mohamedelgheithcheikhtourad.entities.EquipementMedical;

import java.util.Optional;

public interface EquipementMedicalRepository extends JpaRepository<EquipementMedical,Long> {
   Optional<EquipementMedical> findByNumeroSerie(String numeroSerie);
}
