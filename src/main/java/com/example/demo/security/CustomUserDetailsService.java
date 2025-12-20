package com.example.demo.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomUserDetailsService implements UserDetailsService {

    private final Map<String, UserDetails> users = new ConcurrentHashMap<>();

    public CustomUserDetailsService() {
        users.put(
                "admin",
                new UserPrincipal(
                        "admin",
                        "password",
                        List.of(new SimpleGrantedAuthority("ROLE_ADMIN"))
                )
        );
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        return new UserPrincipal(
                username,
                "",
                List.of(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }
    public void register(String username, String password, String role) {
        // test helper – no DB needed
    }

	public UserPrincipal login(String username, String password) {
        return new UserPrincipal(username, List.of("ROLE_USER"));
	}

	public UserPrincipal lookup(String username) {
        return new UserPrincipal(username, List.of("ROLE_USER"));
	}

}
