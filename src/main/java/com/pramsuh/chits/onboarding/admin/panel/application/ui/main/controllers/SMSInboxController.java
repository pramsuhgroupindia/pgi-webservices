package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.SMSInbox;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.SMSInboxRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/customer/smsinbox")
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
        for (SMSInbox sms:smsList
             ) {
            sms.setNow(LocalDateTime.now());
        }
        if(null != this.entityManager) {
            entityManager.persist(smsList);
        }
        return ResponseEntity.ok("Uploaded");
    }

}
