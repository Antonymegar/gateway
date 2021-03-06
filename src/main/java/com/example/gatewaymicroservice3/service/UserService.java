package com.example.gatewaymicroservice3.service;

import com.example.gatewaymicroservice3.model.Role;
import com.example.gatewaymicroservice3.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
