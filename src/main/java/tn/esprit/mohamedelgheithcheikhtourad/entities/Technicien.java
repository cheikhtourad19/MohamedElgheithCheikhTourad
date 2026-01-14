package tn.esprit.mohamedelgheithcheikhtourad.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Technicien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTechnicien;
    private String nom;
    private String specialite;
    private String telephone;

    @ManyToMany(mappedBy = "techniciens",fetch = FetchType.EAGER)
    private List<Intervention> interventions;
}
