package User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class ServiceIMPL implements IService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @Override
    public User saveUser(User user){
        return userRepo.save(user);
    }

    @Override
    public void removeUser(Long id){
        userRepo.deleteById(id);
    }

}
