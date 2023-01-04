package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;


import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SignInData;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.SignupDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/customer/signin")
public class SignInController {
    @Autowired
    SignupDetailsRepository signupDetailsRepository;

    @GetMapping("/profiles/customers")
    public List<SignupDetails> getAllProfilesFromCustomersTable() {
        return signupDetailsRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<SignInData> getProfileByNumber(@RequestBody SignInData signInData) {
        if(signupDetailsRepository.findProfileByAadharNumber(signInData.getAadharNumber()).isPresent()){
            if(signupDetailsRepository.findProfileByAadharNumber(signInData.getAadharNumber()).get().getPassword().equalsIgnoreCase(signInData.getPassword()) ) {
                signInData.setMessage("FOUND");
                return ResponseEntity.ok(signInData);
            }else{
                signInData.setMessage("NOT FOUND");
                return ResponseEntity.ok(signInData);
            }
        }
        signInData.setMessage("EXCEPTIONAL");
        return ResponseEntity.ok(signInData);
    }
}
