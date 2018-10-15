package hu.elte.keza.issuetracker.repositories;

import hu.elte.keza.issuetracker.entities.Item;
import hu.elte.keza.issuetracker.entities.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Item, Long> {
    List<Item> findAllByCreatedBy(Customer user);
}
