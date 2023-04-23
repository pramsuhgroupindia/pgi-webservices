package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBEyojanaApplication;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBEyojanaApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/request/eyojana")
public class HBEYojanaAppController {
    private static final Logger logger = LoggerFactory.getLogger(HBEYojanaAppController.class);

    @Autowired
    HBEyojanaApplicationRepository hbEyojanaApplicationRepository;

    @GetMapping("/all")
    public List<HBEyojanaApplication> getAllApplications() {
        return hbEyojanaApplicationRepository.findAll();
    }

    @GetMapping("{aadhar}")
    public HBEyojanaApplication getProfileByAadhar(@PathVariable String aadhar) {
        return hbEyojanaApplicationRepository.findProfileByAadhar(aadhar);
    }

    @GetMapping("{number}")
    public HBEyojanaApplication getProfileByNumber(@PathVariable int number) {
        return hbEyojanaApplicationRepository.findProfileByNumber(number);
    }

    @PostMapping
    public ResponseEntity<String> createRegistrationDetails(@RequestBody HBEyojanaApplication input) {
        input.setNow(LocalDateTime.now());
        input.setUpdated(LocalDateTime.now());
        input.setNumber(hbEyojanaApplicationRepository.findAll().size()+1);
        HBEyojanaApplication output = hbEyojanaApplicationRepository.save(input);
        if(output != null){
            return ResponseEntity.ok("SUCCESS");
        }
        return ResponseEntity.ok("FAILURE");
    }
}
