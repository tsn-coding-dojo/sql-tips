package com.dojo_java_orm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "auteur_info")
public class AuteurInfo {
    @Id
    private Long id;

    @OneToOne
    private Auteur auteur;

    private String couleurPref;

    private Integer age;

    private String ville;

    private String pays;
}
