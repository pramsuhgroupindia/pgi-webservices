package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerSignInData;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBSignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBCustomerDetailsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBCustomerSignupDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/signin")
public class HBCustomerSignInController {
    @Autowired
    HBCustomerSignupDetailsRepository HBCustomerSignupDetailsRepository;

    @Autowired
    HBCustomerDetailsRepository HBCustomerDetailsRepository;
    @GetMapping("/all")
    public List<HBSignupDetails> getAllProfilesFromCustomersTable() {
        return HBCustomerSignupDetailsRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public HBCustomerDetails getProfileByMobNum(@PathVariable String aadharNumber) {
        return HBCustomerDetailsRepository.findProfileByAadharNumber(aadharNumber);
    }

    @PostMapping
    public ResponseEntity<HBCustomerDetails> getProfileByNumber(@RequestBody HBCustomerSignInData signInData) {
        HBCustomerDetails memberDetails = HBCustomerDetailsRepository.findProfileByAadharNumber(signInData.getAadharNumber());
        if(memberDetails != null){
            try {
                if (memberDetails.getPassword().equalsIgnoreCase(signInData.getPassword())) {
                    signInData.setMessage("REGISTERED");
                    memberDetails.setMessage("FOUND");
                    return ResponseEntity.ok(memberDetails);
                } else {
                    signInData.setMessage("NOT REGISTERED");
                    HBCustomerDetails member = new HBCustomerDetails();
                    member.setMessage("NOT FOUND");
                    return ResponseEntity.ok(member);
                }
            }catch(NoSuchElementException e){
                signInData.setMessage("NoSuchElementException");
                memberDetails.setMessage("NoSuchElementException");
                return ResponseEntity.ok(memberDetails);
            }
        }
        signInData.setMessage("EXCEPTIONAL");
        memberDetails.setMessage("EXCEPTIONAL");
        return ResponseEntity.ok(memberDetails);
    }
}
