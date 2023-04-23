package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBLoanApplication;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBLoanApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/request/loan")
public class HBLoanAppController {
    private static final Logger logger = LoggerFactory.getLogger(HBLoanAppController.class);

    @Autowired
    HBLoanApplicationRepository hbLoanApplicationRepository;

    @GetMapping("/all")
    public List<HBLoanApplication> getAllApplications() {
        return hbLoanApplicationRepository.findAll();
    }

    @GetMapping("{aadhar}")
    public HBLoanApplication getProfileByAadhar(@PathVariable String aadhar) {
        return hbLoanApplicationRepository.findProfileByAadhar(aadhar);
    }

    @GetMapping("{number}")
    public HBLoanApplication getProfileByNumber(@PathVariable int number) {
        return hbLoanApplicationRepository.findProfileByNumber(number);
    }

    @PostMapping
    public ResponseEntity<String> createRegistrationDetails(@RequestBody HBLoanApplication input) {
        input.setNow(LocalDateTime.now());
        input.setUpdated(LocalDateTime.now());
        input.setNumber(hbLoanApplicationRepository.findAll().size()+1);
        HBLoanApplication output = hbLoanApplicationRepository.save(input);
        if(output != null){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
