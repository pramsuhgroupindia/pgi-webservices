package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerLocation;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBCustomerLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/location")
public class HBCustomerLocationController {

    @Autowired
    HBCustomerLocationRepository HBCustomerLocationRepository;

    @GetMapping("/all")
    public List<HBCustomerLocation> getAllProfileLocations() {
        return HBCustomerLocationRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public ResponseEntity<HBCustomerLocation> getLocationByNumber(@PathVariable String aadharNumber) {
        if(HBCustomerLocationRepository.findLocationByaadharNumber(aadharNumber).isPresent()){
                return ResponseEntity.ok(HBCustomerLocationRepository.findLocationByaadharNumber(aadharNumber).get());
        }
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<HBCustomerLocation> postLocation(@RequestBody HBCustomerLocation location) {
        location.setNow(LocalDateTime.now());
        HBCustomerLocationRepository.save(location);
        return ResponseEntity.ok(location);
    }
}
