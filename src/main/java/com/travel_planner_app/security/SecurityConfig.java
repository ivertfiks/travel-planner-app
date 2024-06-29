package com.travel_planner_app.security;

import com.travel_planner_app.security.filter.AuthentificationFilter;
import com.travel_planner_app.security.manager.CustomAuthenticationManager;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
@AllArgsConstructor
public class SecurityConfig {

    private final CustomAuthenticationManager customAuthenticationManager;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        AuthentificationFilter authentificationFilter = new AuthentificationFilter(customAuthenticationManager);
        authentificationFilter.setFilterProcessesUrl(SecurityConstants.LOGIN_PATH);

        return httpSecurity
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(
                auth -> auth.requestMatchers(HttpMethod.POST, SecurityConstants.REGISTRATION_PATH).permitAll()
                    .anyRequest().authenticated()
            )
            .sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .addFilter(authentificationFilter)
            .build();
    }

}
