package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.AdminData;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.RegistrationDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AdminDataRepo;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.RegistrationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/web/services")
public class AdminDataController {
    @Autowired
    AdminDataRepo adminDataRepo;


    @GetMapping
    public List<AdminData> getAllAdminData(){
        return adminDataRepo.findAll();
    }

    @PostMapping
    public AdminData createAdminData(@RequestBody AdminData adminData){
        return adminDataRepo.save(adminData);
    }



}