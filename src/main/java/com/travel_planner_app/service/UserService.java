package com.travel_planner_app.service;

import com.travel_planner_app.entity.User;
import java.util.List;

public interface UserService {

    User getUser(int id);
    User saveUser(User user);
    User getUser(String username);
    List<User> getAllUsers();
}
