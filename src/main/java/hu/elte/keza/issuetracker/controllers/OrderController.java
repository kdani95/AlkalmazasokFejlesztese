package hu.elte.keza.issuetracker.controllers;

import hu.elte.keza.issuetracker.entities.Category;
import hu.elte.keza.issuetracker.entities.Order;
import hu.elte.keza.issuetracker.entities.ShopItem;
import hu.elte.keza.issuetracker.repositories.OrderRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("orders")
@RestController
public class OrderController extends BaseController<Order, OrderRepository> {
    
    @GetMapping("/byid/{orderId}")
    public ResponseEntity<Iterable<ShopItem>> items(@PathVariable Long orderId)
    {
        Iterable<Order> orders = getAll().getBody();
        List<ShopItem> items = new ArrayList<ShopItem>();
        for(Order o: orders){
            if(orderId == o.getOrderId()){
                items.add(o.getItem());
            }
        }
        
        return ResponseEntity.ok( items);
        
    }
    
    @PostMapping("/{id}/order")
    public ResponseEntity<Order> newMessage(@PathVariable Long id,
            @RequestBody Order order)
    {

           return post(order);
 
    }
    
}
