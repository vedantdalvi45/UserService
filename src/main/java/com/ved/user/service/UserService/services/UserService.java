package com.ved.user.service.UserService.services;

import com.ved.user.service.UserService.models.User;

import java.util.List;



public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getSinlgeUser(String userId);

    void deleteUser(String userId);

    User updateUser(User user, String userId);

}
