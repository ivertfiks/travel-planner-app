package com.travel_planner_app.service.impl;

import com.travel_planner_app.entity.User;
import com.travel_planner_app.repository.UserRepository;
import com.travel_planner_app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }
}
