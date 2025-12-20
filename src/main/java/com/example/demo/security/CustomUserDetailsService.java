package com.example.demo.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // dummy in-memory user for tests
        List<String> roles = List.of("ROLE_USER");

        return new UserPrincipal(
                username,
                "password",
                roles.stream()
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList())
        );
    }

    // helper for tests
    public UserDetails loadUser(String username, List<String> roles) {
        return new UserPrincipal(
                username,
                "password",
                roles.stream()
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList())
        );
    }
    @Override
    public UserDetails loadUserByUsername(String username) {
        return register(username, "password", "ROLE_USER");
    }

    public UserPrincipal register(String username, String password, String role) {
        return new UserPrincipal(
                username,
                password,
                List.of(new SimpleGrantedAuthority(role))
        );
    }
}
