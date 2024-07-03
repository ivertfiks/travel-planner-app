package com.travel_planner_app.security;

import com.travel_planner_app.security.util.RandomKeyGenerator;

public class SecurityConstants {

    // TODO: using format below create 3 constants: REGISTRATION_PATH("/users/register"), LOGIN_PATH("/users/login) & TOKEN_EXPIRATION 2 hours - 7200000
    public static final String REGISTRATION_PATH = "/users/register";
    public static final String LOGIN_PATH = "/users/login";
    public static final Long TOKEN_EXPIRATION = 7200000L;
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";
    public static final String SECRET_KEY = RandomKeyGenerator.generateRandomKey();

}
