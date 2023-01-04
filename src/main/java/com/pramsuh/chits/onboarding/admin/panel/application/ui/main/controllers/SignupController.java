package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.RegistrationDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.RegistrationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/web/services/customer/signup")
public class RegistrationDetailsController {
    @Autowired
    RegistrationDetailsRepository registrationDetailsRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/profiles")
    public List<RegistrationDetails> getAllProfiles() {
        return registrationDetailsRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public Optional<RegistrationDetails> getProfileByMobNum(@PathVariable String aadharNumber) {
        return registrationDetailsRepository.findProfileByaadharNumber(aadharNumber);
    }

    @PostMapping
    public ResponseEntity<RegistrationDetails> createRegistrationDetails(@RequestBody RegistrationDetails registrationDetails) {
        if (!registrationDetailsRepository.findProfileByaadharNumber(registrationDetails.getAadharNumber()).isPresent()) {
            RegistrationDetails registrationDetails1 = registrationDetailsRepository.save(registrationDetails);
            if(registrationDetails1 != null){
                registrationDetails1.setMessage("REGISTERED");
                return ResponseEntity.ok(registrationDetails1);
            }
//            if (!customerRepository.findProfileByaadharNumber(registrationDetails.getAadharNumber()).isPresent()) {
//                Customer customer = new Customer();
//                customer.setCustomerName(registrationDetails1.getFullName());
//                customer.setMobileNumber(registrationDetails1.getMobileNumber());
//                customer.setPassword(registrationDetails1.getPassword());
//                customer.setAadharNumber(registrationDetails1.getAadharNumber());
//                customer.setMessage("REGISTERED");
//                customerRepository.save(customer);
//                registrationDetails1.setMessage("REGISTERED");
//                return ResponseEntity.ok(registrationDetails1);
//            } else{
//                registrationDetails.setMessage("ALREADY REGISTERED");
//            }
        } else{
            registrationDetails.setMessage("ALREADY REGISTERED");
            return ResponseEntity.ok(registrationDetails);
        }
        registrationDetails.setMessage("ERROR");
        return ResponseEntity.ok(registrationDetails);
    }
}
