package tn.esprit.mohamedelgheithcheikhtourad.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
public class EquipementMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    private String numeroSerie;
    private String nom;
    private String fabricant;
    private String modele;
    private Date dateAchat;
    private Double coutAcquisition;

    @Enumerated(EnumType.STRING)
    private StatuOperation statu;

    @ManyToOne
    private Emplacement emplacement;

    @OneToMany(mappedBy = "equipementMedical",fetch = FetchType.EAGER)
    private List<Intervention> interventions;
}
