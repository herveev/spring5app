package herve.springframework.spring5app.repositories;

import herve.springframework.spring5app.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
