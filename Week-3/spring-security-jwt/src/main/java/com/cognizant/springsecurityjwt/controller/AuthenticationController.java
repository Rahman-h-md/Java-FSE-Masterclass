package com.cognizant.springsecurityjwt.controller;

import com.cognizant.springsecurityjwt.model.AuthenticationResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate() {

        return new AuthenticationResponse("Dummy JWT Token");
    }
}