package services.impl;

import exceptions.ResourceNotFountException;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getSinlgeUser(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFountException("User with given id is not found on server !!"));
    }
}
