package com.dojo_java_orm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "livre")
public class Livre {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private Integer page;
    private String type;
    private String editeur;
    private String isbn;

   @ManyToMany(cascade = { CascadeType.MERGE })
   @JoinTable(
          name = "auteur_livre",
           joinColumns = { @JoinColumn(name = "livre_id") },
            inverseJoinColumns = { @JoinColumn(name = "auteur_id") }
   )
   private Set<Auteur> authors = new HashSet<>();
}
