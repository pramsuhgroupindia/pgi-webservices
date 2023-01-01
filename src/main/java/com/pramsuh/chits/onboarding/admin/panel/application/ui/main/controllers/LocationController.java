package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Location;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/web/services/customer/location")
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/all")
    public List<Location> getAllProfileLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("{mobileNumber}")
    public ResponseEntity<Location> getLocationByNumber(@PathVariable String mobileNumber) {
        if(locationRepository.findLocationByMobileNumber(mobileNumber).isPresent()){
                return ResponseEntity.ok(locationRepository.findLocationByMobileNumber(mobileNumber).get());
        }
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<Location> postLocation(@RequestBody Location location) {
        locationRepository.save(location);
        return ResponseEntity.ok(location);
    }
}
