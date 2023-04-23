package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBSavingsAccApplication;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBSavingsAccApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/request/sbacc")
public class HBSavingAccAppController {
    private static final Logger logger = LoggerFactory.getLogger(HBSavingAccAppController.class);

    @Autowired
    HBSavingsAccApplicationRepository hbSavingsAccApplicationRepository;

    @GetMapping("/all")
    public List<HBSavingsAccApplication> getAllApplications() {
        return hbSavingsAccApplicationRepository.findAll();
    }

    @GetMapping("{aadhar}")
    public HBSavingsAccApplication getProfileByAadhar(@PathVariable String aadhar) {
        return hbSavingsAccApplicationRepository.findRecordByAadhar(aadhar);
    }

    @GetMapping("{number}")
    public HBSavingsAccApplication getProfileByNumber(@PathVariable int number) {
        return hbSavingsAccApplicationRepository.findRecordByNumber(number);
    }

    @PostMapping
    public ResponseEntity<String> createRegistrationDetails(@RequestBody HBSavingsAccApplication input) {
        input.setNow(LocalDateTime.now());
        input.setUpdated(LocalDateTime.now());
        input.setNumber(hbSavingsAccApplicationRepository.findAll().size()+1);
        HBSavingsAccApplication output = hbSavingsAccApplicationRepository.save(input);
        if(output != null){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
