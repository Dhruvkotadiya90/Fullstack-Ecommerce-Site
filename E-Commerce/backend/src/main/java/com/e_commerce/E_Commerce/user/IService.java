package com.e_commerce.E_Commerce.user;
import java.util.List;


public interface IService {

    List<User> getAllUser();

    User updateUser(Long id, User user);

    User saveUser(User user);

    void removeUser(Long id);


}
