package services.impl;

import models.User;
import org.springframework.stereotype.Service;
import services.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getSinlgeUser(String userId) {
        return null;
    }
}
