package com.dojo_java_orm;

import com.dojo_java_orm.model.Author;
import com.dojo_java_orm.model.Book;
import com.dojo_java_orm.repositories.AuthorRepository;
import com.dojo_java_orm.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DojoJavaOrmApplication {

    private static AuthorRepository authorRepository;
    private static BookRepository bookRepository;

    @Autowired
    public DojoJavaOrmApplication(AuthorRepository authorRepository,
                                  BookRepository bookRepository
                                  )
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(DojoJavaOrmApplication.class, args);

        // Exo 1
        Author author = new Author();
        author.setName("toto");
        authorRepository.save(author);

        Author author1 = new Author();
        author1.setName("titi");
        authorRepository.save(author1);

        Book book = new Book();
        book.setTitle("livre 1");
        bookRepository.save(book);
        Book book1 = new Book();
        book1.setTitle("livre2");
        bookRepository.save(book1);

        //Exo2

//        Set<Book> books = new HashSet<>();
//        books.add(book);
//        books.add(book1);
//        author.setBooks(books);
//        author1.setBooks(books);
//        authorRepository.save(author);
//        authorRepository.save(author1);

        //Exo 3

//        Set<Author> authors = new HashSet<>();
//        authors.add(author);
//        authors.add(author1);
//        book.setAuthors(authors);
//        bookRepository.save(book);
    }
}
