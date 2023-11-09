package com.example.talk.controller;

import com.example.talk.model.Account;
import com.example.talk.model.dto.ConsentForm;
import com.example.talk.model.dto.SignUpForm;
import com.example.talk.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl; // 사용자 정보를 처리하는 서비스

    @PostMapping("/verifyName")
    public String verifyName(@ModelAttribute ConsentForm consentForm, Principal principal) {
        String currentUserId = principal.getName(); // 현재 로그인된 사용자의 ID를 가져옴
        Account currentUser = customerServiceImpl.retrieve(currentUserId); // 사용자 정보를 가져옴

        String inputName = consentForm.getName();
//        String inputRrn = consentForm.getRrn();
//        String inputPhoneNum = consentForm.getPhoneNum();
        if (currentUser.getName().equals(inputName)) {
            return "applyInsurance";
        } else {
            return "consent";
        }
    }

    @GetMapping("/signUp")
    public String signUp() {
        System.out.println("signUp");
        return "signUp";
    }

    @PostMapping("/createCustomer")
    public String create(@ModelAttribute SignUpForm signUpForm) {
        customerServiceImpl.create(signUpForm);
        return "redirect:/";
    }


}
