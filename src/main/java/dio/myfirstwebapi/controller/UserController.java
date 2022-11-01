package dio.myfirstwebapi.controller;

import dio.myfirstwebapi.model.User;
import dio.myfirstwebapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<User> getUsers(){
        //não é recomendado aplicar regras de negócios nos nossos controllers, apenas direcionar.
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public User getOneUser(@PathVariable("username") String username){
        return repository.findByUserName(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user){ // para garantir que vou poder converter o objeto.
        repository.save(user);
    }

    @PutMapping()
    public void putUser(@RequestBody User user){ // para garantir que vou poder converter o objeto.
        repository.save(user);
    }
}
