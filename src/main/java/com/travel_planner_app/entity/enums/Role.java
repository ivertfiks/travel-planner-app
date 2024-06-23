package com.travel_planner_app.entity.enums;

public enum Role {
    USER("User");

    private final String role;
    Role(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
}
