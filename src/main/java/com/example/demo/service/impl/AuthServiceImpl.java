package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.security.UserPrincipal;
import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class AuthServiceImpl implements AuthService {

    private final JwtTokenProvider jwtTokenProvider;

    public AuthServiceImpl(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public AuthResponse login(AuthRequest request) {

        UserPrincipal principal = new UserPrincipal(
                1L,
                request.getUsername(),
                "",
                Collections.emptyList()
        );

        String token = jwtTokenProvider.generateToken(principal);
        return new AuthResponse(token);
    }

    @Override
    public AuthResponse register(AuthRequest request) {

        UserPrincipal principal = new UserPrincipal(
                1L,
                request.getUsername(),
                "",
                Collections.emptyList()
        );

        String token = jwtTokenProvider.generateToken(principal);
        return new AuthResponse(token);
    }
}
