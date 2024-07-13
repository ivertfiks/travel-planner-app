package com.travel_planner_app.service.impl;

import com.travel_planner_app.entity.User;
import com.travel_planner_app.repository.UserRepository;
import com.travel_planner_app.service.UserService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User getUser(int id) {
        Optional<User> user = userRepository.findById(id);
        return unwrapUser(user);
    }

    @Override
    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User getUser(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return unwrapUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    private User unwrapUser(Optional<User> entity) {
        if (entity.isPresent()) {
            return entity.get();
        } else {
            throw new RuntimeException("User not found");
        }
    }
}
