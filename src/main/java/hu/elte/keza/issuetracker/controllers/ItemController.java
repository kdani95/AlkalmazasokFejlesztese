package hu.elte.keza.issuetracker.controllers;

import hu.elte.keza.issuetracker.entities.Item;
import hu.elte.keza.issuetracker.entities.Category;
import hu.elte.keza.issuetracker.entities.Message;
import hu.elte.keza.issuetracker.repositories.MessageRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hu.elte.keza.issuetracker.repositories.ItemRepository;
import hu.elte.keza.issuetracker.repositories.CustomerRepository;

@RequestMapping("items")
@RestController
public class ItemController extends BaseController<Item, CustomerRepository>
{
   
}