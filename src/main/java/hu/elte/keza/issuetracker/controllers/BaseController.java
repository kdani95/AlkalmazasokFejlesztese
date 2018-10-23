package hu.elte.keza.issuetracker.controllers;

import hu.elte.keza.issuetracker.entities.BaseEntity;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("categories")
@RestController
public abstract class BaseController<
        T extends BaseEntity, 
        R extends CrudRepository<T, Long>>
{
    @Autowired
    private R repository;

    protected <T extends BaseEntity> Optional<T> getEntity(Long Id)
    {
        return (Optional<T>) repository.findById(Id);
    }

    protected T saveEntity(T t)
    {
        return repository.save(t);
    }

    protected void deleteEntity(Long Id)
    {
        repository.deleteById(Id);
    }

    @GetMapping("")
    public ResponseEntity<Iterable<T>> getAll()
    {
        return new ResponseEntity(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> get(@PathVariable Long id)
    {
        Optional<T> optionalIssue = repository.findById(id);
        if (optionalIssue.isPresent())
        {
            return (ResponseEntity<T>) ResponseEntity.ok(optionalIssue.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("")
    public ResponseEntity<T> post(@RequestBody T t)
    {
        T newT = repository.save(t);
        return ResponseEntity.ok(newT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id)
    {
        Optional<T> optionalT = repository.findById(id);
        if (optionalT.isPresent())
        {
            deleteEntity(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> put(@PathVariable Long id, @RequestBody T t)
    {
        Optional<T> optionalT = repository.findById(id);
        if (optionalT.isPresent())
        {
            t.setId(id);
            return ResponseEntity.ok(repository.save(t));
        }
        return ResponseEntity.notFound().build();
    }

}
