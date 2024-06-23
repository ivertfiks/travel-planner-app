package com.travel_planner_app.service;

import com.travel_planner_app.entity.User;
import com.travel_planner_app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


}
