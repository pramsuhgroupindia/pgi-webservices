package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.RegistrationDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.RegistrationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/signup")
public class RegistrationDetailsController {
    @Autowired
    RegistrationDetailsRepository registrationDetailsRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/profiles")
    public List<RegistrationDetails> getAllProfiles() {
        return registrationDetailsRepository.findAll();
    }


    @PostMapping
    public ResponseEntity<Customer> createRegistrationDetails(@RequestBody RegistrationDetails registrationDetails) {
        if (!registrationDetailsRepository.findProfileByMobileNumber(registrationDetails.getMobileNumber()).isPresent()) {
            RegistrationDetails registrationDetails1 = registrationDetailsRepository.save(registrationDetails);
            if (!customerRepository.findProfileByMobileNumber(registrationDetails.getMobileNumber()).isPresent()) {
                Customer customer = new Customer();
                customer.setMobileNumber(registrationDetails1.getMobileNumber());
                customer.setPassword(registrationDetails1.getPassword());
                customer.setMessage("Registered");
                customerRepository.save(customer);
                return ResponseEntity.ok(customer);
            }
        }
        Customer customer1 = new Customer();
        customer1.setMessage("Not registered");
        customer1.setMobileNumber("0000000000");
        customer1.setPassword("123456");
        return ResponseEntity.ok(customer1);
    }

}
