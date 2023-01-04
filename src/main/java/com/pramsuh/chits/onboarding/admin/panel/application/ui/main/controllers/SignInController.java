package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/customer/signin")
public class CustomersController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/profiles/customers")
    public List<Customer> getAllProfilesFromCustomersTable() {
        return customerRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Customer> getProfileByNumber(@RequestBody Customer customer) {
        if(customerRepository.findProfileByaadharNumber(customer.getAadharNumber()).isPresent()){
            if(customerRepository.findProfileByaadharNumber(customer.getAadharNumber()).get().getPassword().equalsIgnoreCase(customer.getPassword()) ) {
                customer.setMessage("FOUND");
                return ResponseEntity.ok(customer);
            }else{
                customer.setMessage("NOT FOUND");
                return ResponseEntity.ok(customer);
            }
        }
        customer.setMessage("EXCEPTIONAL");
        return ResponseEntity.ok(customer);
    }
}
