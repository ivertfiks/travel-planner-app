package com.travel_planner_app.service;

import com.travel_planner_app.entity.User;

public interface UserService {

    User getUser(int id);
    User saveUser(User user);
    User getUser(String username);
}
