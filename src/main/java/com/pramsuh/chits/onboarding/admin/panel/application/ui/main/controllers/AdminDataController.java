package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.commons.AdminData;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AdminDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/admin/data")
public class AdminDataController {
    @Autowired
    AdminDataRepo adminDataRepo;


    @GetMapping
    public List<AdminData> getAllAdminData() {
        return adminDataRepo.findAll();
    }

    @PostMapping
    public AdminData createAdminData(@RequestBody AdminData adminData) {
        return adminDataRepo.save(adminData);
    }


}