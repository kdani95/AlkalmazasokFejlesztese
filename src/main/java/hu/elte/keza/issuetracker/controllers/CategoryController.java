package hu.elte.keza.issuetracker.controllers;

import hu.elte.keza.issuetracker.entities.ShopItem;
import hu.elte.keza.issuetracker.entities.Category;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hu.elte.keza.issuetracker.repositories.CategoryRepository;

@RequestMapping("categories")
@RestController
public class CategoryController extends BaseController<Category, CategoryRepository>
{
   
    @GetMapping("/{id}/items")
    public ResponseEntity<Iterable<ShopItem>> items(@PathVariable Long id)
    {
        Optional<Category> oCategory = getEntity(id);
        if (oCategory.isPresent())
        {
            return ResponseEntity.ok( oCategory.get().getItems());
        }
        return ResponseEntity.notFound().build();
    }
    
    

}