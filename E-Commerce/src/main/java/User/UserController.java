package User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IService service;

    @GetMapping
    public List<User> getAllUser(){
        return service.getAllUser();
    }

    @PostMapping
    public User saveUser(User user){
        return service.saveUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public String removeUser(@PathVariable Long id){
        service.removeUser(id);
        return "Removed Successfully";
    }


}
