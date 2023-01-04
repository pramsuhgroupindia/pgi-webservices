package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.SignupDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/web/services/customer/signup")
public class SignupController {
    @Autowired
    SignupDetailsRepository signupDetailsRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/profiles")
    public List<SignupDetails> getAllProfiles() {
        return signupDetailsRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public Optional<SignupDetails> getProfileByMobNum(@PathVariable String aadharNumber) {
        return signupDetailsRepository.findProfileByAadharNumber(aadharNumber);
    }

    @PostMapping
    public ResponseEntity<SignupDetails> createRegistrationDetails(@RequestBody SignupDetails signupDetails) {
        System.out.println("Object is "+signupDetailsRepository.findProfileByAadharNumber(signupDetails.getAadharNumber()).isPresent());
        if (!signupDetailsRepository.findProfileByAadharNumber(signupDetails.getAadharNumber()).isPresent()) {
            SignupDetails signupDetails1 = signupDetailsRepository.save(signupDetails);
            if(signupDetails1 != null){
                signupDetails1.setMessage("REGISTERED");
                return ResponseEntity.ok(signupDetails1);
            }
//            if (!customerRepository.findProfileByaadharNumber(signupDetails.getAadharNumber()).isPresent()) {
//                Customer customer = new Customer();
//                customer.setCustomerName(signupDetails1.getFullName());
//                customer.setMobileNumber(signupDetails1.getMobileNumber());
//                customer.setPassword(signupDetails1.getPassword());
//                customer.setAadharNumber(signupDetails1.getAadharNumber());
//                customer.setMessage("REGISTERED");
//                customerRepository.save(customer);
//                signupDetails1.setMessage("REGISTERED");
//                return ResponseEntity.ok(signupDetails1);
//            } else{
//                signupDetails.setMessage("ALREADY REGISTERED");
//            }
        } else{
            signupDetails.setMessage("ALREADY REGISTERED");
            return ResponseEntity.ok(signupDetails);
        }
        signupDetails.setMessage("ERROR");
        return ResponseEntity.ok(signupDetails);
    }
}
