package com.fmi.frontendmodbdglobal.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "angajat")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Angajat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_angajat_global")
    @SequenceGenerator(name = "sec_angajat_global", sequenceName = "sec_angajat_global", initialValue = 1000, allocationSize = 1)
    @Column(name = "id_angajat")
    private Long idAngajat;

    private String nume;
    private String prenume;

    @Column(name = "nr_telefon")
    private String nrTelefon;

    @Column(name = "data_angajare")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataAngajare;

    private Integer salariu;

    @OneToMany(mappedBy = "angajat")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @ToString.Exclude
    private List<Rezervare> rezervari = new ArrayList<>();
}
