package herve.springframework.spring5app.repositories;

import herve.springframework.spring5app.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {
}
