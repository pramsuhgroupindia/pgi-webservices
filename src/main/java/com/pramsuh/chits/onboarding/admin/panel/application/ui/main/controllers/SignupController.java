package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.MemberDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.CustomerRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.SignupDetailsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.MemberDetailsRepository;
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
    MemberDetailsRepository memberDetailsRepository;
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
        if (!signupDetailsRepository.findProfileByAadharNumber(signupDetails.getAadharNumber()).isPresent()) {
            SignupDetails signupDetails1 = signupDetailsRepository.save(signupDetails);
            if (!memberDetailsRepository.findProfileByAadharNumber(signupDetails1.getAadharNumber()).isPresent()) {
                MemberDetails memberDetails = new MemberDetails();
                memberDetails.setFullName(signupDetails1.getFullName());
                memberDetails.setEmailId(signupDetails1.getEmailId());
                memberDetails.setMobileNumber(signupDetails1.getMobileNumber());
                memberDetails.setDateOfBirth(signupDetails1.getDateOfBirth());
                memberDetails.setOccupation(signupDetails1.getOccupation());
                memberDetails.setAddress(signupDetails1.getAddress());
                memberDetails.setAadharNumber(signupDetails1.getAadharNumber());
                memberDetails.setPanNumber(signupDetails1.getPanNumber());
                memberDetails.setPassword(signupDetails1.getPassword());
                memberDetails.setConfirmPassword(signupDetails1.getConfirmPassword());
                memberDetails.setNomineeFullName(signupDetails1.getNomineeFullName());
                memberDetails.setAadharCard(signupDetails1.getAadharCard());
                memberDetails.setPanCard(signupDetails1.getPanCard());
                memberDetails.setAddressCard(signupDetails1.getAddressCard());
                memberDetails.setNomineeAge(signupDetails1.getNomineeAge());
                memberDetails.setNomineeAddress(signupDetails1.getNomineeAddress());
                memberDetails.setNomineeAadharNumber(signupDetails1.getNomineeAadharNumber());
                memberDetails.setNomineePanNumber(signupDetails1.getNomineePanNumber());
                memberDetails.setNomineeMobNumber(signupDetails1.getNomineeMobNumber());
                memberDetails.setOccupation(signupDetails1.getOccupation());
                memberDetails.setNomineeRelation(signupDetails1.getNomineeRelation());
                memberDetails.setMessage("REGISTERED");
                memberDetailsRepository.save(memberDetails);
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
