package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import com.example.demo.security.JwtTokenProvider;

@Configuration
public class SecurityConfig {

    @Bean
    public JwtTokenProvider jwtTokenProvider() {
        return new JwtTokenProvider(
                "very-long-secret-key-for-tests-1234567890",
                3600000L   // 1 hour
        );
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http,
                                           JwtTokenProvider jwtTokenProvider)
            throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/auth/**",
                    "/swagger-ui/**",
                    "/v3/api-docs/**",
                    "/api/relationships/**",
                    "/api/conflict-cases/**",
                    "/api/conflict-flags/**",
                    "/api/persons/**",
                    "/api/engagements/**"
                ).permitAll()
                .anyRequest().authenticated()
            );

        return http.build();
    }
}
