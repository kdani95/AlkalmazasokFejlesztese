package hu.elte.keza.issuetracker.repositories;

import hu.elte.keza.issuetracker.entities.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Category, Long> {
}
