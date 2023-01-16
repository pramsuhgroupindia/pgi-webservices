package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.EnrollRequests;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.EnrollRequestsRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/auctionable/schemes/durations/frequency/amounts/enroll")
public class EnrollRequestsController {
    @Autowired
    EnrollRequestsRepository enrollRequestsRepository;
    @GetMapping("/all")
    public List<EnrollRequests> getAllEnrollments() {
        return enrollRequestsRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public List<EnrollRequests> getAllEnrollmentsMainUserWise(@PathVariable String aadhar_number) {
        return enrollRequestsRepository.findAllByAadharNumber(aadhar_number);
    }

    @PostMapping
    public ResponseEntity<String> createEnrollmentData(@RequestBody EnrollRequests requests) {
        EnrollRequests enrollRequests = enrollRequestsRepository.save(requests);
        if(enrollRequests == null){
            return ResponseEntity.ok("ERROR");
        }
        return ResponseEntity.ok("YOU ARE SUCCESSFULLY ENROLLED");
    }


}
