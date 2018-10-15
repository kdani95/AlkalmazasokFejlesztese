package hu.elte.keza.issuetracker.repositories;

import hu.elte.keza.issuetracker.entities.Category;
import hu.elte.keza.issuetracker.entities.Item;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
