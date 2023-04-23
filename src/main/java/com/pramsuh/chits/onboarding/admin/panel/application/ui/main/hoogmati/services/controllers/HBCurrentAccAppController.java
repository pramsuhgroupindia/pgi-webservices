package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCurrentAccApplication;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBSavingsAccApplication;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBCurrentAccApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/request/cbacc")
public class HBCurrentAccAppController {
    private static final Logger logger = LoggerFactory.getLogger(HBCurrentAccAppController.class);

    @Autowired
    HBCurrentAccApplicationRepository hbCurrentAccApplicationRepository;

    @GetMapping("/all")
    public List<HBCurrentAccApplication> getAllApplications() {
        return hbCurrentAccApplicationRepository.findAll();
    }

    @GetMapping("{aadhar}")
    public HBCurrentAccApplication getProfileByAadhar(@PathVariable String aadhar) {
        return hbCurrentAccApplicationRepository.findRecordByAadhar(aadhar);
    }

    @GetMapping("{number}")
    public HBCurrentAccApplication getProfileByNumber(@PathVariable int number) {
        return hbCurrentAccApplicationRepository.findRecordByNumber(number);
    }

    @PostMapping
    public ResponseEntity<String> createRegistrationDetails(@RequestBody HBCurrentAccApplication input) {
        input.setNow(LocalDateTime.now());
        input.setUpdated(LocalDateTime.now());
        input.setNumber(hbCurrentAccApplicationRepository.findAll().size()+1);
        HBCurrentAccApplication output = hbCurrentAccApplicationRepository.save(input);
        if(output != null){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
