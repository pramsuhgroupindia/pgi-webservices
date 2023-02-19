package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.EnrollRequests;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.EnrollRequestsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.EnrollmentStatus;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/auctionable/schemes/durations/frequency/amounts/enroll")
public class EnrollRequestsController {
    @Autowired
    EnrollRequestsRepository enrollRequestsRepository;
    @GetMapping("/all/inprogress")
    public ResponseEntity<List<EnrollRequests>> getAllInProgressEnrollments(@RequestParam String aadhar_number, @RequestParam EnrollmentStatus status) {
        return new ResponseEntity<List<EnrollRequests>>(enrollRequestsRepository.findByAadharNumberAndStatus(aadhar_number, status), HttpStatus.OK);
    }

    @GetMapping("/all/approved")
    public ResponseEntity<List<EnrollRequests>> getAllApprovedEnrollments(@RequestParam String aadhar_number, @RequestParam EnrollmentStatus status) {
        return new ResponseEntity<List<EnrollRequests>>(enrollRequestsRepository.findByAadharNumberAndStatus(aadhar_number, status), HttpStatus.OK);
    }

    @GetMapping("/all/rejected")
    public ResponseEntity<List<EnrollRequests>> getAllRejectedEnrollments(@RequestParam String aadhar_number, @RequestParam EnrollmentStatus status) {
        return new ResponseEntity<List<EnrollRequests>>(enrollRequestsRepository.findByAadharNumberAndStatus(aadhar_number, status), HttpStatus.OK);
    }
    @GetMapping("/all")
    public List<EnrollRequests> getAllEnrollmentsMainUserWise(@RequestParam String aadhar_number) {
        return enrollRequestsRepository.findAllByAadharNumber(aadhar_number);
    }

    @PostMapping
    public ResponseEntity<String> createEnrollmentData(@RequestBody EnrollRequests requests) {
        requests.setNow(LocalDateTime.now());
        EnrollRequests enrollRequests = enrollRequestsRepository.save(requests);
        if(enrollRequests == null){
            return ResponseEntity.ok("ERROR");
        }
        return ResponseEntity.ok("YOU ARE SUCCESSFULLY ENROLLED");
    }


}
