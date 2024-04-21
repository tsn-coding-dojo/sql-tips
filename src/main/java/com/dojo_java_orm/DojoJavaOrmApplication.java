package com.dojo_java_orm;

import com.dojo_java_orm.repositories.AuteurRepository;
import com.dojo_java_orm.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DojoJavaOrmApplication {

    private static AuteurRepository authorRepository;
    private static LivreRepository bookRepository;

    @Autowired
    public DojoJavaOrmApplication(AuteurRepository authorRepository,
                                  LivreRepository bookRepository
                                  )
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(DojoJavaOrmApplication.class, args);
    }
}
