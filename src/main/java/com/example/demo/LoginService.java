package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String login() {
        System.out.println("Logging in!");
        return "ok";
    }

}
