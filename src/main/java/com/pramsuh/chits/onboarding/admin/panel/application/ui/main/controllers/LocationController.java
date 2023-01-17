package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.Location;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/customer/location")
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/all")
    public List<Location> getAllProfileLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("{aadharNumber}")
    public ResponseEntity<Location> getLocationByNumber(@PathVariable String aadharNumber) {
        if(locationRepository.findLocationByaadharNumber(aadharNumber).isPresent()){
                return ResponseEntity.ok(locationRepository.findLocationByaadharNumber(aadharNumber).get());
        }
        return ResponseEntity.ok(null);
    }

    @PostMapping
    public ResponseEntity<Location> postLocation(@RequestBody Location location) {
        Location userLocation = locationRepository.save(location);
        return ResponseEntity.ok(location);
    }
}
