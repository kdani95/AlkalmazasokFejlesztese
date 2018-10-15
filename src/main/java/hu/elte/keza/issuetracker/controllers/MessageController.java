package hu.elte.keza.issuetracker.controllers;

import hu.elte.keza.issuetracker.entities.Item;
import hu.elte.keza.issuetracker.entities.Message;
import hu.elte.keza.issuetracker.repositories.MessageRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hu.elte.keza.issuetracker.repositories.CustomerRepository;

@RequestMapping("messages")
@RestController
public class MessageController extends BaseController<Message, MessageRepository>
{

}