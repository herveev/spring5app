package herve.springframework.spring5app.repositories;

import herve.springframework.spring5app.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
