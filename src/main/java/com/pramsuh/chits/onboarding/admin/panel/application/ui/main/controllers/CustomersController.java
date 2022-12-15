package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/signin")
public class CustomersController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/profiles/customers")
    public List<Customer> getAllProfilesFromCustomersTable() {
        return customerRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<HttpStatus> getProfileByNumber(@RequestBody Customer customer) {
        if(customerRepository.findProfileByMobileNumber(customer.getMobileNumber()).isPresent()){
            if(customerRepository.findProfileByMobileNumber(customer.getMobileNumber()).get().getPassword().equalsIgnoreCase(customer.getPassword()) ) {
                return ResponseEntity.ok(HttpStatus.FOUND);
            }
        }
        return ResponseEntity.ok(HttpStatus.NOT_FOUND);
    }
}
