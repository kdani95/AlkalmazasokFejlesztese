package hu.elte.keza.issuetracker.repositories;

import hu.elte.keza.issuetracker.entities.Category;
import hu.elte.keza.issuetracker.entities.Item;
import hu.elte.keza.issuetracker.entities.Message;
import hu.elte.keza.issuetracker.entities.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Item> findAllByCreatedBy(Item item);
}
