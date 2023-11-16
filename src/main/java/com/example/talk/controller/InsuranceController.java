package com.example.talk.controller;

import com.example.talk.service.InsuranceServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class InsuranceController {

    @Autowired
    private InsuranceServiceImpl insuranceServiceImpl;

    @GetMapping("/insurances")
    public String showInsuranceList(Model model) {
        insuranceServiceImpl.retrieveAll(model);
        return "showInsurance";
    }

    @GetMapping("/insurance/join")
    public String showJoinInsuranceForm() {
        return "agreement";
    }

    @GetMapping("/insurance/join/consent")
    public String showConsentForm() {
        return "consent";
    }

//    @PostMapping("/submit")
//    public String submitName() {
//        return "consent";
//    }

    @PostMapping("/applyInsurance")
    public String retrieveSelectedInsurance(@RequestParam("insuranceId") String insuranceId, RedirectAttributes redirectAttributes) {
        insuranceServiceImpl.retrieve(Long.parseLong(insuranceId));
        redirectAttributes.addAttribute("insuranceId", insuranceId);

        return "redirect:/applyContract";
    }
}
