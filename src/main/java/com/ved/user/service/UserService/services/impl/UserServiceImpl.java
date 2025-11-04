package com.ved.user.service.UserService.services.impl;

import com.ved.user.service.UserService.exceptions.ResourceNotFountException;
import com.ved.user.service.UserService.exceptions.DuplicateEntryException;
import com.ved.user.service.UserService.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ved.user.service.UserService.repository.UserRepository;
import com.ved.user.service.UserService.services.UserService;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new DuplicateEntryException("User with this email already exists !!");
        }
        user.setId(UUID.randomUUID().toString());
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

    @Override
    public void deleteUser(String userId) {
        User user = userRepository.findById(userId).orElseThrow(() ->
                new ResourceNotFountException("User with given id is not found on server !!"));

        userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(User user, String userId) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFountException("User with given id is not found on server !!"));

        User updatedUser = User.builder()
                .name(user.getName())
                .email(user.getEmail())
                .about(user.getAbout())
                .build();
        return userRepository.save(updatedUser);
    }
}
