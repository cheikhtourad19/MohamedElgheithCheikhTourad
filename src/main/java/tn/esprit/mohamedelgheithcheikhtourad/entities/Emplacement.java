package tn.esprit.mohamedelgheithcheikhtourad.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Emplacement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomSalle;
    private Integer etage;
    private String batiment;

    @OneToMany(mappedBy = "emplacement", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<EquipementMedical> equipementMedicals;
}
