package herve.springframework.spring5app.bootstrap;

import herve.springframework.spring5app.domain.Author;
import herve.springframework.spring5app.domain.Book;
import herve.springframework.spring5app.repositories.AuthorRepository;
import herve.springframework.spring5app.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric" , "Evans");
        Book ddd = new Book("Domain Driven Design","5879654");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB","756984120021");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        System.out.println("Started in BootStrap");
        System.out.println("Number of Books: " +bookRepository.count());


    }
}
