package com.dojo_java_orm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

//TODO Exo1
//@Entity
@Getter
@Setter
//@Table(name = "author")
public class Author {
    //EXO1
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    //TODO Exo2
   // @OneToMany(fetch = FetchType.LAZY)
    //@JoinColumn(name = "author_id",referencedColumnName = "id")
    //TODO EXO3
//    @ManyToMany(mappedBy = "authors",cascade = CascadeType.MERGE)
//    private Set<Book> books = new HashSet<>();
}
