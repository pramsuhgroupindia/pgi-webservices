package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBSignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBCustomerDetailsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBCustomerSignupDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/signup")
public class HBCustomerSignUpController {
    @Autowired
    HBCustomerSignupDetailsRepository HBCustomerSignupDetailsRepository;

    @Autowired
    HBCustomerDetailsRepository HBCustomerDetailsRepository;

    @GetMapping("/all")
    public List<HBCustomerDetails> findAll() {
        return HBCustomerDetailsRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public Optional<HBSignupDetails> findProfileByAadharNumber(@PathVariable String aadharNumber) {
        return HBCustomerSignupDetailsRepository.findProfileByAadharNumber(aadharNumber);
    }

    @PostMapping
    public ResponseEntity<HBSignupDetails> createRegistrationDetails(@RequestBody HBSignupDetails signupDetails) {
        signupDetails.setNow(LocalDateTime.now());
        signupDetails.setUpdated(LocalDateTime.now());
        if (!HBCustomerSignupDetailsRepository.findProfileByAadharNumber(signupDetails.getAadharNumber()).isPresent()) {
            HBSignupDetails signupDetails1 = HBCustomerSignupDetailsRepository.save(signupDetails);
            if (HBCustomerDetailsRepository.findProfileByAadharNumber(signupDetails1.getAadharNumber()) == null) {
                HBCustomerDetails memberDetails = new HBCustomerDetails();
                memberDetails.setFirst(signupDetails1.getFirst());
                memberDetails.setMiddle(signupDetails1.getMiddle());
                memberDetails.setLast(signupDetails1.getLast());
                memberDetails.setMobileNumber(signupDetails1.getMobileNumber());
                memberDetails.setAadharNumber(signupDetails1.getAadharNumber());
                memberDetails.setPanNumber(signupDetails1.getPanNumber());
                memberDetails.setPassword(signupDetails1.getPassword());
                memberDetails.setConfirmPassword(signupDetails1.getConfirmPassword());
                memberDetails.setMessage("REGISTERED");
                memberDetails.setNow(LocalDateTime.now());
                memberDetails.setUpdated(LocalDateTime.now());
                HBCustomerDetailsRepository.save(memberDetails);
            }
            if(signupDetails1 != null){
                signupDetails1.setMessage("REGISTERED");
                return ResponseEntity.ok(signupDetails1);
            }
        } else{
            signupDetails.setMessage("ALREADY REGISTERED");
            return ResponseEntity.ok(signupDetails);
        }
        signupDetails.setMessage("ERROR");
        return ResponseEntity.ok(signupDetails);
    }
}
