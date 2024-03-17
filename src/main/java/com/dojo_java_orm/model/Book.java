package com.dojo_java_orm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name = "book")
public class Book {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;


    //Exo3
//    @ManyToMany(cascade = { CascadeType.MERGE })
//    @JoinTable(
//            name = "Book_Author",
//            joinColumns = { @JoinColumn(name = "book_id") },
//            inverseJoinColumns = { @JoinColumn(name = "author_id") }
//    )
//    private Set<Author> authors = new HashSet<>();
}
