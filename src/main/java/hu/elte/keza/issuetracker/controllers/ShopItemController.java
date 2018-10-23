package hu.elte.keza.issuetracker.controllers;

import hu.elte.keza.issuetracker.entities.Category;
import hu.elte.keza.issuetracker.entities.ShopItem;
import hu.elte.keza.issuetracker.repositories.ItemRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("items")
@RestController
public class ShopItemController extends BaseController<ShopItem, ItemRepository>{
    
}
