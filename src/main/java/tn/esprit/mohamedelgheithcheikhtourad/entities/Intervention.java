package tn.esprit.mohamedelgheithcheikhtourad.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntervention;
    private Date dateDebut;
    private Date dateFin;
    private Integer dureeHeures;
    private String type;
    private String rapport;
    private Double coutPieces;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Technicien> techniciens;

    @ManyToOne(fetch = FetchType.EAGER)
    private EquipementMedical equipementMedical;
}
