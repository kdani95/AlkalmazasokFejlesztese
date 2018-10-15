package hu.elte.keza.issuetracker.controllers;

import hu.elte.keza.issuetracker.entities.Item;
import hu.elte.keza.issuetracker.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hu.elte.keza.issuetracker.repositories.CustomerRepository;
import hu.elte.keza.issuetracker.repositories.CategoryRepository;

@RequestMapping("messages")
@RestController
public class MessageController extends BaseController<Message, CategoryRepository>
{

}