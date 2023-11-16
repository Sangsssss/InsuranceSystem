package com.example.talk.controller;

import com.example.talk.model.Account;
import com.example.talk.model.dto.ConsentForm;
import com.example.talk.repository.AccountUserRepository;
import com.example.talk.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl; // 사용자 정보를 처리하는 서비스

    @Autowired
    private AccountUserRepository accountUserRepository;

    @PostMapping("/verifyName")
    public String verifyName(@ModelAttribute ConsentForm consentForm, Principal principal) {
        String currentUserId = principal.getName(); // 현재 로그인된 사용자의 ID를 가져옴
        System.out.println(currentUserId);
        Account currentUser = customerServiceImpl.retrieve(currentUserId); // 사용자 정보를 가져옴

        String inputName = consentForm.getName();
        String inputRrn = consentForm.getRrn();
        String inputPhoneNum = consentForm.getPhoneNum();
        System.out.println();
        if (currentUser.getName().equals(inputName) && currentUser.getRrn().equals(inputRrn) && currentUser.getPhoneNum().equals(inputPhoneNum)) {
            return "applyInsurance";
        } else {
            return "consent";
        }
    }
//
//    @GetMapping("/signUp")
//    public String signUp() {
//        System.out.println("signUp");
//        return "signUp";
//    }

//    @PostMapping("/createCustomer")
//    public String create(@ModelAttribute SignUpForm signUpForm) {
//        customerServiceImpl.create(signUpForm);
//        return "redirect:/";
//    }


}
