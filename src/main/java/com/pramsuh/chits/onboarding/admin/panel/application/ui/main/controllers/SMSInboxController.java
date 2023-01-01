package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.mobiledata.UserContacts;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Location;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SMSInbox;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.SMSInboxRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/customer/smsinbox")
public class SMSInboxController {
    @Autowired
    SMSInboxRepository smsInboxRepository;
    private EntityManager entityManager;
    @GetMapping("/all")
    public List<SMSInbox> getAllSmsList() {
        return smsInboxRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public List<SMSInbox> getAllSmsListAadharWise(@PathVariable String aadharNumber) {
        return smsInboxRepository.findAllByaadharNumber(aadharNumber);
    }

    @PostMapping
    public ResponseEntity<String> createSmsInboxListData(@RequestBody List<SMSInbox> smsList) {
        smsInboxRepository.saveAll(smsList);
        if(null != this.entityManager) {
            entityManager.persist(smsList);
        }
        return ResponseEntity.ok("Uploaded");
    }

}
