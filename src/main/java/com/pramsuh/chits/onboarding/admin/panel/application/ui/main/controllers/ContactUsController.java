package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.ContactUs;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/contactus")
public class ContactUsController {

    @Autowired
    ContactUsRepository contactUsRepository;

    @GetMapping
    public ResponseEntity<List<ContactUs>> getAllBranchInformation() {
        return new ResponseEntity<List<ContactUs>>(contactUsRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("{code}")
    public ResponseEntity<ContactUs> findByCode(@PathVariable String code){
        return new ResponseEntity<ContactUs>(contactUsRepository.findByCode(code), HttpStatus.OK);
    }
}
