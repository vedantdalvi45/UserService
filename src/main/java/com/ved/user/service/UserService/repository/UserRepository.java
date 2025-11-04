package com.ved.user.service.UserService.repository;

import com.ved.user.service.UserService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<Object> findByEmail(String email);
}
