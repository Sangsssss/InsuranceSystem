package com.example.talk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    @GetMapping("/")
    public String login() {
        System.out.println("login");
        return "login";
    }

}
