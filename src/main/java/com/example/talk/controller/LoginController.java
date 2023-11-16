package com.example.talk.controller;

import com.example.talk.model.dto.SignUpForm;
import com.example.talk.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;


    @GetMapping(value = {"/", "/login"})
    public String login() {
        System.out.println("login");
        return "login";
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, response,
                SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
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

    @PostMapping("/newSignUp")
    public String signUp(SignUpForm request) {
        loginService.save(request);
        return "redirect:/login";
    }


}
