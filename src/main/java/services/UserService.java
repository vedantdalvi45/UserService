package services;

import models.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;



public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getSinlgeUser(String userId);

}
