package com.example.talk.controller;

import com.example.talk.service.ContractServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class ContractController {
    @Autowired
    private ContractServiceImpl contractServiceImpl;


    @GetMapping("/applyContract")
    public String applyContract(@RequestParam("insuranceId") String insuranceId, Principal principal) {
        String customerId = principal.getName();
        contractServiceImpl.add(Integer.parseInt(insuranceId), customerId);
        return "home";
    }

    @GetMapping("/contractState")
    public String showContractState(Model model, Principal principal) {
        contractServiceImpl.showContractState(model, principal.getName());
        return "showContract";
    }
}
