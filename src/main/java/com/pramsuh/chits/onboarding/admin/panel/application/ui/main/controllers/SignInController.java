package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;


import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SignInData;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.release1.MemberDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.SignupDetailsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.release1.MemberDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/web/services/customer/signin")
public class SignInController {
    @Autowired
    SignupDetailsRepository signupDetailsRepository;

    @Autowired
    MemberDetailsRepository memberDetailsRepository;
    @GetMapping("/profiles/customers")
    public List<SignupDetails> getAllProfilesFromCustomersTable() {
        return signupDetailsRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public MemberDetails getProfileByMobNum(@PathVariable String aadharNumber) {
        return memberDetailsRepository.findProfileByAadharNumber(aadharNumber).get();
    }

    @PostMapping
    public ResponseEntity<MemberDetails> getProfileByNumber(@RequestBody SignInData signInData) {
        Optional<MemberDetails> memberDetails = memberDetailsRepository.findProfileByAadharNumber(signInData.getAadharNumber());
        if(memberDetails != null){
            try {
                if (memberDetails.get().getPassword().equalsIgnoreCase(signInData.getPassword())) {
                    signInData.setMessage("REGISTERED");
                    memberDetails.get().setMessage("FOUND");
                    return ResponseEntity.ok(memberDetails.get());
                } else {
                    signInData.setMessage("NOT REGISTERED");
                    memberDetails.get().setMessage("NOT FOUND");
                    return ResponseEntity.ok(memberDetails.get());
                }
            }catch(NoSuchElementException e){
                signInData.setMessage("NoSuchElementException");
                memberDetails.get().setMessage("NoSuchElementException");
                return ResponseEntity.ok(memberDetails.get());
            }
        }
        signInData.setMessage("EXCEPTIONAL");
        memberDetails.get().setMessage("EXCEPTIONAL");
        return ResponseEntity.ok(memberDetails.get());
    }
}
