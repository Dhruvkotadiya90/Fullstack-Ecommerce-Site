package com.e_commerce.E_Commerce.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceIMPL implements IService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @Override
    public User updateUser(Long id, User user){
        User existingUser = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhone(user.getPhone());
        return userRepo.save(existingUser);
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
