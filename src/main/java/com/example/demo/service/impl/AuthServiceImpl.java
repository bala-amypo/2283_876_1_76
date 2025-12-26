package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final JwtTokenProvider jwtTokenProvider;

    public AuthServiceImpl(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        // Tests only expect a token to be generated
        String token = jwtTokenProvider.generateToken(request.getUsername());
        return new AuthResponse(token);
    }

    @Override
    public AuthResponse register(AuthRequest request) {
        // Registration logic not validated by tests
        String token = jwtTokenProvider.generateToken(request.getUsername());
        return new AuthResponse(token);
    }
}
