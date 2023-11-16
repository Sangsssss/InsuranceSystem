package com.example.talk.controller;

import com.example.talk.model.dto.SignUpForm;
import com.example.talk.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @GetMapping("/login")
    public String login() {
        System.out.println("login");
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        System.out.println("home");
        return "home";
    }

    @GetMapping("/signUp")
    public String signUp() {
        System.out.println("SignUp");
        return "signUp";
    }

    @PostMapping("/user")
    public String signUp(SignUpForm request) {
        loginService.save(request);
        return "redirect:/login";
    }
}
