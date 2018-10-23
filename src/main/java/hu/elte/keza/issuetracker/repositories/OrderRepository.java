package hu.elte.keza.issuetracker.repositories;

import hu.elte.keza.issuetracker.entities.Category;
import hu.elte.keza.issuetracker.entities.Order;
import hu.elte.keza.issuetracker.entities.ShopItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByOrderId(int orderId);
}
