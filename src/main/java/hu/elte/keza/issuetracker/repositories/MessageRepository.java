package hu.elte.keza.issuetracker.repositories;

import hu.elte.keza.issuetracker.entities.Item;
import hu.elte.keza.issuetracker.entities.Message;
import hu.elte.keza.issuetracker.entities.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Item> findAllByCreatedBy(Customer user);
}
