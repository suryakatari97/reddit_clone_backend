package com.example.springredditclone.controller;

import com.example.springredditclone.dto.RegisterRequest;
import com.example.springredditclone.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController  {

    private final AuthService authService;

    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequest registerRequest) {
        authService.signUp(registerRequest);
    }

}
